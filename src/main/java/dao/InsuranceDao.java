package dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import model.InsuranceEntity;

@Mapper
public interface InsuranceDao {

	/**
	    * 添加保单数据
	 *
	 * @return
	 */
	@Insert("insert into carNum,carFrame,carEng,carDate,insurName,insurPhone from car,insurance"
			+ " where car.id = insurance.id and Insur_name=#{Insur_name}")
	/*
	 * @Insert("insert into insurance(insurName,insurCate,insurPaper,insurPhone,insurAddr,insurEmail)"
	 * +
	 * " values(#{insurName},#{insurCate},#{insurPaper},#{insurPhone},#{insurAddr},#{insurEmail})"
	 * )
	 */
	        Integer addInsur(InsuranceEntity insuranceEntity);

	/**
	    *  删除保单数据
	 * @return
	 */
	  @Delete ("delete from insurance where insurName=#{insurName}")
	  String deleteInsurListByName(InsuranceEntity insuranceEntity);
		
	
}
