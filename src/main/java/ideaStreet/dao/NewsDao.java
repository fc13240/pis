package ideaStreet.dao;

import java.util.List;

import ideaStreet.domain.Article;
import ideaStreet.domain.News;
import ideaStreet.domain.NewsComment;
import ideaStreet.domain.NewsType;
import ideaStreet.domain.Page;



public interface NewsDao {
	List<News> getNewsShow();
	
	News getUserNewsById(int userId);
	
	List<News> getAllNews(Page page);
	
	List<NewsType> getAllNewsTypes();
	
	int getAllNewsCount();
	
	List<News> newsShow();
	
	void praise(News news);
	
	void slander(News news);
	
	void addNewsComment(String content, int newsId, int userId);

	List<NewsComment> getNewsCommentsById(int newsId);

	List<News> getNewsByRand();
	
}