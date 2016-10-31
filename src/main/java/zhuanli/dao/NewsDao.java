package zhuanli.dao;

import java.util.List;

import zhuanli.domain.News;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;



public interface NewsDao {
	List<News> getNewsShow();
	
	News getUserNewsById(int userId);
	
	List<News> getAllNews(Page page);
	
	List<NewsType> getAllNewsTypes();
	
	int getAllNewsCount();
	
	List<News> newsShow();
}
