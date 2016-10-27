package zhuanli.dao;

import java.util.List;

import zhuanli.domain.Article;

import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;



public interface ArticleDao {
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle(Page page);
	
	List<ArticleType> getAllArticleTypes();
	
	int getAllArticleCount();
	
	List<Article> articleShow();
}
