package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.NewsDao;
import zhuanli.dao.mapper.NewsMapper;
import zhuanli.domain.News;
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
	public List<News> getAllNews() {
		return newsMapper.getAllNews();
	}

	@Override
	public List<NewsType> getAllNewsTypes() {
		return newsMapper.getAllNewsTypes();
	}

	
}
