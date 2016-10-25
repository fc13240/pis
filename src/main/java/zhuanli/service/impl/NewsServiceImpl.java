package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.NewsDao;
import zhuanli.service.NewsService;



public class NewsServiceImpl implements NewsService {
	private NewsDao newsDao;

	public NewsServiceImpl(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	
}
