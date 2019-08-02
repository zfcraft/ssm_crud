package controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.InsuranceEntity;
import service.InsuranceService;

@RestController
public class InsuranceController {
	
	@Resource
	private InsuranceService insuranceService;

	/**
	 *保存表单数据  
	 */
	@RequestMapping("/insertInsur")
	public InsuranceEntity insertIsur( HttpServletRequest request, @RequestBody InsuranceEntity insuranceEntity ) {
		if(insuranceEntity!=null && insuranceEntity.getInsurName()!=null)
		{
			insuranceService.addInsur(insuranceEntity);
		
		
		return insuranceEntity;}
		else 
			return null;
	}
	@RequestMapping("/delete")
	public InsuranceEntity deleteInsurListByName( HttpServletRequest request, @RequestBody InsuranceEntity insuranceEntity ) {
		if(insuranceEntity!=null && insuranceEntity.getInsurName()!=null)
		{
			insuranceService.deleteInsurListByName(insuranceEntity);
		
		
		return insuranceEntity;}
		else 
			return null;
	}
	
}
