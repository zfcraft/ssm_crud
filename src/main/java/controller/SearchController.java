package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.InsuranceEntity;
import service.SearchService;
@RestController
public class SearchController {
	@Resource
	private SearchService searchService;
	/**
	   *查询车辆投保列表信息 
	 */
	@RequestMapping("/queryIsur")
	public InsuranceEntity queryIsur( HttpServletRequest request,@RequestBody InsuranceEntity insuranceEntity) {
		
		String insurName = insuranceEntity.getInsurName();
		
		insuranceEntity = searchService.selecInsurEntityByName(insurName);
		System.out.println(insuranceEntity.getCarEntity().getCarNum());

		return insuranceEntity;
	
	}
}
