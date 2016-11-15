package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.NewsMobileDao;
import zhuanli.dao.mapper.NewsMobileMapper;
import zhuanli.domain.News;
import zhuanli.domain.NewsComment;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;


public class NewsMobileMybatisDao extends SqlSessionDaoSupport implements NewsMobileDao{
	private NewsMobileMapper newsMobileMapper;

	public void setNewsMobileMapper(NewsMobileMapper newsMobileMapper) {
		this.newsMobileMapper = newsMobileMapper;
	}

	@Override
	public List<News> getNewsShow() {
		return newsMobileMapper.getNewsShow();
	}

	@Override
	public News getUserNewsById(int userId) {
		return newsMobileMapper.getUserNewsById(userId);
	}

	@Override
	public List<News> getAllNews(Page page){
		return newsMobileMapper.getAllNews(page);
	}

	@Override
	public List<NewsType> getAllNewsTypes() {
		return newsMobileMapper.getAllNewsTypes();
	}

	@Override
	public int getAllNewsCount() {
		return newsMobileMapper.getAllNewsCount();
	}

	@Override
	public List<News> newsShow() {
		return newsMobileMapper.newsShow();
	}

	@Override
	public void praise(News news) {
		newsMobileMapper.praise(news);
	}

	@Override
	public void slander(News news) {
		newsMobileMapper.slander(news);
	}
	
	@Override
	public void addNewsComment(String content, int newsId, int userId) {
		newsMobileMapper.addNewsComment(content, newsId,userId);
		
	}

	@Override
	public List<NewsComment> getNewsCommentsById(int newsId) {
		return newsMobileMapper.getNewsCommentsById(newsId);
	}

	@Override
	public List<News> getNewsByRand() {
		return newsMobileMapper.getNewsByRand();
	}




}
