package zhuanli.service;

import java.util.List;
import zhuanli.domain.News;

public interface NewsMobileService {
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
	
	List<News> mobileIndexNewsShow();
	
	List<News> mobileIndexImageNewsShow();
	
}
