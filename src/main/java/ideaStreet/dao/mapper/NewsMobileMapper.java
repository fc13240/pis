package ideaStreet.dao.mapper;

import java.util.List;

import ideaStreet.domain.News;

public interface NewsMobileMapper {
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
		
	List<News> mobileIndexNewsShow();
	
	List<News> mobileIndexImageNewsShow();
	
}
