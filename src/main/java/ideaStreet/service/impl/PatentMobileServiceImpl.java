package ideaStreet.service.impl;

import java.util.List;

import ideaStreet.dao.PatentMobileDao;
import ideaStreet.domain.MobilePatent;
import ideaStreet.domain.Page;
import ideaStreet.service.PatentMobileService;



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
