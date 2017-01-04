package ideaStreet.service.impl;

import java.util.List;

import ideaStreet.dao.NewsDao;
import ideaStreet.domain.Article;
import ideaStreet.domain.News;
import ideaStreet.domain.NewsComment;
import ideaStreet.domain.NewsType;
import ideaStreet.domain.Page;
import ideaStreet.service.NewsService;



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

	@Override
	public List<News> getNewsByRand() {
		return newsDao.getNewsByRand();
	}

	@Override
	public List<News> getHomepageByType(int type, int size) {
		return newsDao.getHomepageByType(type, size);
	}

}
