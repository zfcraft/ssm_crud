package dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import model.InsuranceEntity;

@Mapper
public interface SearchDao {
	/**
	 * 查询保单数据
	 * @return 车牌号码，车架号，发动机号，初登日期，投保人名称，投保人移动电话
	 *  id,carNum,carFrame,carEng,carDate,carValue
	 *  insurName,insurCate,insurPaper,insurPhone,insurAddr,insurEmail
	 */
	@Results({
		@Result(column="id",property="id",id=true),
		@Result(column="insurName",property="insurName"),//id=true，表示为主键
		@Result(column="insurCate",property="insurCate"),
		@Result(column="insurPaper",property="insurPaper"),
		@Result(column="insurPhone",property="insurPhone"),
		@Result(column="insurAddr",property="insurAddr"),
		@Result(column="insurEmail",property="insurEmail"),
	@Result(column="id",property="carEntity",one=@One(select="com.fulan.server.dao.CarDao",fetchType=FetchType.EAGER))})
	@Select("select carNum,carFrame,carEng,carDate,insurName,insurPhone from car,insurance"
			+ " where car.id = insurance.id and Insur_name=#{Insur_name}")
	InsuranceEntity selecInsurListByName(String insurName);


}
