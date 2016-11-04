package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.NewsDao;
import zhuanli.domain.Article;
import zhuanli.domain.News;
import zhuanli.domain.NewsComment;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;
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
	public List<News> getAllNews(Page page) {
		return newsDao.getAllNews(page);
	}

	@Override
	public List<NewsType> getAllNewsTypes() {
		return newsDao.getAllNewsTypes();
	}

	@Override
	public int getAllNewsCount() {
		return newsDao.getAllNewsCount();
	}

	@Override
	public List<News> newsShow() {
	
		return newsDao.newsShow();
		
	}

	@Override
	public void praise(News news) {
		newsDao.praise(news);
	}

	@Override
	public void slander(News news) {
		newsDao.slander(news);
	}
	
	@Override
	public void addNewsComment(String content, int newsId, int userId) {
		newsDao.addNewsComment(content, newsId,userId);
		
	}

	@Override
	public List<NewsComment> getNewsCommentsById(int newsId) {
		return newsDao.getNewsCommentsById(newsId);
	}

}
