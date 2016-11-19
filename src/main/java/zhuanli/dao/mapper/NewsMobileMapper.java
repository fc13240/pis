package zhuanli.dao.mapper;

import java.util.List;
import zhuanli.domain.News;

public interface NewsMobileMapper {
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
		
	List<News> mobileIndexNewsShow();
	
	List<News> mobileIndexImageNewsShow();
	
}
