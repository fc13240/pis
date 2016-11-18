package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.NewsMobileDao;
import zhuanli.domain.News;
import zhuanli.domain.NewsComment;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;
import zhuanli.service.NewsMobileService;



public class NewsMobileServiceImpl implements NewsMobileService {
	private NewsMobileDao newsMobileDao;

	public NewsMobileServiceImpl(NewsMobileDao newsMobileDao) {
		this.newsMobileDao = newsMobileDao;
	}

	@Override
	public List<News> getNewsShow() {
		return newsMobileDao.getNewsShow();
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
	public List<NewsType> getAllNewsTypes() {
		return newsMobileDao.getAllNewsTypes();
	}

	@Override
	public int getAllNewsCount() {
		return newsMobileDao.getAllNewsCount();
	}

	@Override
	public List<News> newsShow() {
	
		return newsMobileDao.newsShow();
		
	}

	@Override
	public void praise(News news) {
		newsMobileDao.praise(news);
	}

	@Override
	public void slander(News news) {
		newsMobileDao.slander(news);
	}
	
	@Override
	public void addNewsComment(String content, int newsId, int userId) {
		newsMobileDao.addNewsComment(content, newsId,userId);
		
	}

	@Override
	public List<NewsComment> getNewsCommentsById(int newsId) {
		return newsMobileDao.getNewsCommentsById(newsId);
	}

	@Override
	public List<News> getNewsByRand() {
		return newsMobileDao.getNewsByRand();
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
