package zhuanli.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zhuanli.domain.News;
import zhuanli.domain.NewsSearchCondition;
import zhuanli.domain.NewsType;
import zhuanli.domain.Page;



public interface NewsMapper {
	
	List<News> getNewsShow();
	
	News getUserNewsById(int userId);
	
	List<News> getAllNews();
	
	List<NewsType> getAllNewsTypes();
}
