package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.CarEntity;
import service.CarService;

/**
 * DEMO_API接口
 * @author 
 *
 */
@RestController
public class CarController {
	
	@Resource
	private CarService carService;
	
	/**
	 *保存车辆数据  id,carNum,carFrame,carEng,carDate,carValue
	 */
	@RequestMapping("/insertCar")
	public CarEntity insertCar( HttpServletRequest request, @RequestBody CarEntity carEntity ) {
		if(carEntity!=null && carEntity.getCarNum()!=null)
		{
			carService.addcar(carEntity);
		
		
		return carEntity;}
		else 
			return null;
	}
	/**
	 * 根据车牌号码
	 * 修改车辆数据
	 */
	@RequestMapping("/updateCar")
	public String updateCar( HttpServletRequest request,@RequestBody CarEntity carEntity) {
		if(carEntity==null && carEntity.getCarNum()==null)
		{return null;}
	else
		return carService.updateCarListByName(carEntity);
	
	}
	
	
	
}

