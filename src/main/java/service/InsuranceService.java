package service;

import org.springframework.stereotype.Service;

import model.InsuranceEntity;
@Service
public interface InsuranceService {
	
	

	Integer addInsur(InsuranceEntity insuranceEntity);
 String deleteInsurListByName(InsuranceEntity insuranceEntity);
}
