package zhuanli.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;



public interface ArticleMapper {
	
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle(Page page);
	
	List<ArticleType> getAllArticleTypes();
	
	int getAllArticleCount();
	
	List<Article> articleShow();
}
