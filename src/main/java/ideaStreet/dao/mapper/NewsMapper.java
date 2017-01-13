package ideaStreet.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ideaStreet.domain.Article;
import ideaStreet.domain.News;
import ideaStreet.domain.NewsComment;
import ideaStreet.domain.NewsSearchCondition;
import ideaStreet.domain.NewsType;
import ideaStreet.domain.Page;



public interface NewsMapper {
	
	List<News> getNewsShow();
	
	News getUserNewsById(int userId);
	
	List<News> getAllNews(Page page);
	
	List<NewsType> getAllNewsTypes();
	
	int getAllNewsCount();
	
	List<News> newsShow();
	
	void praise(News news);
	
	void slander(News news);
	
	void addNewsComment(@Param("content") String content, @Param("newsId")int newsId, @Param("userId")int userId);

	List<NewsComment> getNewsCommentsById(int newsId);

	List<News> getNewsByRand();
	
	
	List<News> getHomepageByType(@Param("type")int type,@Param("size")int size);

	List<News> getNewsListByType(@Param("typeId") int typeId, @Param("page")Page page);

	int getNewsListByTypeCount(int typeId);

	NewsType getNewsTypeById(int typeId);
	
	List<News> searchNewsByPage(NewsSearchCondition searchCondition);
	
	int searchNewsByCount (NewsSearchCondition searchCondition);
	
	List<News> getNewsOrderByClick(List<Integer> list);
	
	void updateNewsClick(@Param("newsId")int id);
	
	List<News> getNewsByTypeList(List<Integer> list);
}
