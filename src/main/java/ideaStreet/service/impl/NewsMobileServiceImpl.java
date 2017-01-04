package ideaStreet.service.impl;

import java.util.List;

import ideaStreet.dao.NewsMobileDao;
import ideaStreet.domain.News;
import ideaStreet.service.NewsMobileService;



public class NewsMobileServiceImpl implements NewsMobileService {
	private NewsMobileDao newsMobileDao;

	public NewsMobileServiceImpl(NewsMobileDao newsMobileDao) {
		this.newsMobileDao = newsMobileDao;
	}

	@Override
	public News getUserNewsById(int userId) {
		return newsMobileDao.getUserNewsById(userId);
	}

	@Override
	public List<News> getAllNews() {
		return newsMobileDao.getAllNews();
	}

	@Override
	public List<News> mobileIndexNewsShow() {
		return newsMobileDao.mobileIndexNewsShow();
	}

	@Override
	public List<News> mobileIndexImageNewsShow() {
		return newsMobileDao.mobileIndexImageNewsShow();
	}

}
