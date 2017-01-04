package ideaStreet.dao;

import java.util.List;

import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.User;
import ideaStreet.domain.Vote;



public interface ArticleMobileDao {
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle();
	
}
