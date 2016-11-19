package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.PatentMobileDao;
import zhuanli.domain.MobilePatent;
import zhuanli.domain.Page;
import zhuanli.service.PatentMobileService;



public class PatentMobileServiceImpl implements PatentMobileService {
	private PatentMobileDao patentMobileDao;
	
	public PatentMobileServiceImpl(PatentMobileDao patentMobileDao) {
		this.patentMobileDao = patentMobileDao;
	}
	
	@Override
	public List<MobilePatent> getUserPatents(Page page) {
		return patentMobileDao.getUserPatents(page);
	}

	@Override
	public MobilePatent getPatentById(long patentId) {
		return patentMobileDao.getPatentById(patentId);
	}

}
