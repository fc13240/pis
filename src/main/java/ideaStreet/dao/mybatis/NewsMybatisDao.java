package ideaStreet.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import ideaStreet.dao.NewsDao;
import ideaStreet.dao.mapper.NewsMapper;
import ideaStreet.domain.Article;
import ideaStreet.domain.News;
import ideaStreet.domain.NewsComment;
import ideaStreet.domain.NewsType;
import ideaStreet.domain.Page;


public class NewsMybatisDao extends SqlSessionDaoSupport implements NewsDao{
	private NewsMapper newsMapper;

	public void setNewsMapper(NewsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	@Override
	public List<News> getNewsShow() {
		return newsMapper.getNewsShow();
	}

	@Override
	public News getUserNewsById(int userId) {
		return newsMapper.getUserNewsById(userId);
	}

	@Override
	public List<News> getAllNews(Page page){
		return newsMapper.getAllNews(page);
	}

	@Override
	public List<NewsType> getAllNewsTypes() {
		return newsMapper.getAllNewsTypes();
	}

	@Override
	public int getAllNewsCount() {
		return newsMapper.getAllNewsCount();
	}

	@Override
	public List<News> newsShow() {
		return newsMapper.newsShow();
	}

	@Override
	public void praise(News news) {
		newsMapper.praise(news);
	}

	@Override
	public void slander(News news) {
		newsMapper.slander(news);
	}
	
	@Override
	public void addNewsComment(String content, int newsId, int userId) {
		newsMapper.addNewsComment(content, newsId,userId);
		
	}

	@Override
	public List<NewsComment> getNewsCommentsById(int newsId) {
		return newsMapper.getNewsCommentsById(newsId);
	}

	@Override
	public List<News> getNewsByRand() {
		return newsMapper.getNewsByRand();
	}




}