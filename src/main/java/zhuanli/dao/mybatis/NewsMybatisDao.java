package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.NewsDao;
import zhuanli.dao.mapper.NewsMapper;
import zhuanli.domain.News;
import zhuanli.domain.Page;


public class NewsMybatisDao extends SqlSessionDaoSupport implements NewsDao{
	private NewsMapper newsMapper;

	public void setNewsMapper(NewsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	
}
