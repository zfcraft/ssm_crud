package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.InsuranceDao;
import model.InsuranceEntity;
import service.InsuranceService;
@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Resource
	private InsuranceDao insuranceDao;
	
	public Integer addInsur(InsuranceEntity insuranceEntity) {
		// TODO Auto-generated method stub
		return insuranceDao.addInsur(insuranceEntity);
	}

	
	public String deleteInsurListByName(InsuranceEntity insuranceEntity) {
		// TODO Auto-generated method stub
		return insuranceDao.deleteInsurListByName(insuranceEntity);
	}

	
}
