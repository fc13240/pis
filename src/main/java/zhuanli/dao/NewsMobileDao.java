package zhuanli.dao;

import java.util.List;
import zhuanli.domain.News;

public interface NewsMobileDao {
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
	
	List<News> mobileIndexNewsShow();
	
	List<News> mobileIndexImageNewsShow();
	
}
