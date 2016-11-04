package zhuanli.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zhuanli.domain.Article;
import zhuanli.domain.News;
import zhuanli.domain.NewsComment;
import zhuanli.domain.NewsSearchCondition;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;



public interface NewsMapper {
	
	List<News> getNewsShow();
	
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
	
	List<NewsType> getAllNewsTypes();
	
	int getAllNewsCount();
	
	List<News> newsShow();
	
	void praise(News news);
	
	void slander(News news);
	
	void addNewsComment(@Param("content") String content, @Param("newsId")int newsId, @Param("userId")int userId);

	List<NewsComment> getNewsCommentsById(int newsId);
	
	List<News> newsOrderByTimeShow();
	
	List<News> newsOrderByCommentsShow();
}
