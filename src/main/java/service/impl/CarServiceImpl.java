package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CarDao;
import model.CarEntity;
import service.CarService;

/**
 * Demo服务层实现
 * @author foodoo
 *
 */
@Service
public class CarServiceImpl implements CarService{
	
	@Resource
	private CarDao carDao;

	@Transactional

	public Integer addcar(CarEntity carEntity) {
		// TODO Auto-generated method stub
		return carDao.addcar(carEntity);
	}


	public String updateCarListByName(CarEntity carEntity) {
		// TODO Auto-generated method stub
		return carDao.updateCarListByName(carEntity);
	}


}