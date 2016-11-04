package zhuanli.service;

import java.util.List;

import zhuanli.domain.News;
import zhuanli.domain.NewsComment;
import zhuanli.domain.NewsSearchCondition;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;


public interface NewsService {
	List<News> getNewsShow();
	
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
	
	List<NewsType> getAllNewsTypes();
	
	int getAllNewsCount();
	
	List<News> newsShow();
	
	void praise(News news);
	
	void slander(News news);
	
	void addNewsComment(String content, int newsId, int userId);

	List<NewsComment> getNewsCommentsById(int newsId);
	
	List<News> newsOrderByTimeShow();
	
	List<News> newsOrderByCommentsShow();
}
