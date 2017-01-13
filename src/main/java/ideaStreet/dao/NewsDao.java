package ideaStreet.dao;

import java.util.List;

import ideaStreet.domain.News;
import ideaStreet.domain.NewsComment;
import ideaStreet.domain.NewsSearchCondition;
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
	
	List<News> getHomepageByType(int type,int size);

	List<News> getNewsListByType(int typeId, Page page);

	int getNewsListByTypeCount(int typeId);

	NewsType getNewsTypeById(int typeId);
	
	List<News> searchNewsByPage(NewsSearchCondition searchCondition);
	
	int searchNewsByCount (NewsSearchCondition searchCondition);
	
	List<News> getNewsOrderByClick(int type);//获取点击率前十新闻
	
	void updateNewsClick(int id); //更新点击率
	
	List<News> getNewsByTypeList(List<Integer> list);//输入多个新闻类型，获取点击及发布时间排行前10
}
