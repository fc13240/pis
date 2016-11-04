package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.NewsDao;
import zhuanli.dao.mapper.NewsMapper;
import zhuanli.domain.Article;
import zhuanli.domain.News;
import zhuanli.domain.NewsComment;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;


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
	public List<News> getAllNews(){
		return newsMapper.getAllNews();
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
	public List<News> newsOrderByTimeShow() {
		return newsMapper.newsOrderByTimeShow();
	}

	@Override
	public List<News> newsOrderByCommentsShow() {
		return newsMapper.newsOrderByCommentsShow();
	}



}
