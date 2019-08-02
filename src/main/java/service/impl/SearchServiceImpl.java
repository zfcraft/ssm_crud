package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.SearchDao;
import model.InsuranceEntity;
import service.SearchService;
@Service
public class SearchServiceImpl implements SearchService {
	@Resource
	private SearchDao searchDao;
	public InsuranceEntity selecInsurEntityByName(String insurName) {
		// TODO Auto-generated method stub
		return searchDao.selecInsurListByName(insurName);
	}

}
