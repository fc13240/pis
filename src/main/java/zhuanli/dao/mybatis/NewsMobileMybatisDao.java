package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.NewsMobileDao;
import zhuanli.dao.mapper.NewsMobileMapper;
import zhuanli.domain.News;


public class NewsMobileMybatisDao extends SqlSessionDaoSupport implements NewsMobileDao{
	private NewsMobileMapper newsMobileMapper;

	public void setNewsMobileMapper(NewsMobileMapper newsMobileMapper) {
		this.newsMobileMapper = newsMobileMapper;
	}

	@Override
	public News getUserNewsById(int userId) {
		return newsMobileMapper.getUserNewsById(userId);
	}

	@Override
	public List<News> getAllNews(){
		return newsMobileMapper.getAllNews();
	}

	@Override
	public List<News> mobileIndexNewsShow() {
		return newsMobileMapper.mobileIndexNewsShow();
	}

	@Override
	public List<News> mobileIndexImageNewsShow() {
		return newsMobileMapper.mobileIndexImageNewsShow();
	}




}
