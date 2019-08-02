package dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import model.CarEntity;

@Mapper
public interface CarDao {
	
	/*
	 * @Result({@Result(column="id",property="id",id=true),
	 * 
	 * @Result(column="id",property="id",id=true),
	 * 
	 * @Result(column="id",property="id",id=true),
	 * 
	 * 
	 * })
	 */
	/**
	 * 添加车辆数据
	 * @param entity
	 * @return carNum,carFrame,carEng,carDate,carValue
	 */
	@Insert("insert into car(carNum,carFrame,carEng,carDate,carValue)"
		      + " values(#{carNum},#{carFrame},#{carEng},#{carDate},#{carValue})"	)
	        Integer addcar(CarEntity carEntity);
			
	/**
	 * 修改车辆数据
	 * @param name
	 * @return
	 */
	@Update("update car set carFrame=#{carFrame},carEng=#{carEng},carDate=#{carDate},carValue=#{carValue} where carNum=#(carNum)")
	String updateCarListByName(CarEntity carEntity);
	
	}
