package ideaStreet.dao;

import java.util.List;

import ideaStreet.domain.News;

public interface NewsMobileDao {
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
	
	List<News> mobileIndexNewsShow();
	
	List<News> mobileIndexImageNewsShow();
	
}
