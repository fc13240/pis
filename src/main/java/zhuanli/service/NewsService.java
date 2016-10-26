package zhuanli.service;

import java.util.List;

import zhuanli.domain.News;
import zhuanli.domain.NewsSearchCondition;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;


public interface NewsService {
	List<News> getNewsShow();
	
	News getUserNewsById(int userId);
	
	List<News> getAllNews(Page page);
	
	List<NewsType> getAllNewsTypes();
	
	int getAllNewsCount();
	
	List<News> newsShow();
}
