package ideaStreet.service;

import java.util.List;

import ideaStreet.domain.News;

public interface NewsMobileService {
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
	
	List<News> mobileIndexNewsShow();
	
	List<News> mobileIndexImageNewsShow();
	
}
