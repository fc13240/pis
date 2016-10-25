package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.NewsDao;
import zhuanli.domain.News;
import zhuanli.domain.NewsType;
import zhuanli.service.NewsService;



public class NewsServiceImpl implements NewsService {
	private NewsDao newsDao;

	public NewsServiceImpl(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	@Override
	public List<News> getNewsShow() {
		return newsDao.getNewsShow();
	}

	@Override
	public News getUserNewsById(int userId) {
		return newsDao.getUserNewsById(userId);
	}

	@Override
	public List<News> getAllNews() {
		return newsDao.getAllNews();
	}

	@Override
	public List<NewsType> getAllNewsTypes() {
		return newsDao.getAllNewsTypes();
	}

	
}
