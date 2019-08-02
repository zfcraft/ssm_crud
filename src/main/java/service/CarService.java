package service;

import model.CarEntity;

/**
 * Demo服务层接口
 * @author acer
 *
 */
public interface CarService {

	Integer addcar(CarEntity carEntity);
	
	String updateCarListByName(CarEntity carEntity);
	
	
	

}
