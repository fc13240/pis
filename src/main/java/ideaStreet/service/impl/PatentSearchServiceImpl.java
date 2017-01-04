package ideaStreet.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import ideaStreet.dao.PatentSearchDao;
import ideaStreet.domain.Patent;
import ideaStreet.service.PatentSearchService;

public class PatentSearchServiceImpl implements PatentSearchService {
	
	private PatentSearchDao patentSearchDao;

	public PatentSearchServiceImpl(PatentSearchDao patentSearchDao) {
		this.patentSearchDao = patentSearchDao;

	}


	@Override
	public List<Patent> searchByInventionPatentGrant() {
		return patentSearchDao.searchByInventionPatentGrant();
	}


	@Override
	public List<Patent> searchByAbstractsPatent() {
		return patentSearchDao.searchByAbstractsPatent();
	}


	@Override
	public List<Patent> searchByUtilityModelPatent() {
		return patentSearchDao.searchByUtilityModelPatent();
	}


	@Override
	public List<Patent> searchByAppearanceDesignPatent() {
		return patentSearchDao.searchByAppearanceDesignPatent();
	}

	

}
