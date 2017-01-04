package ideaStreet.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.Vote;



public interface ArticleMobileMapper {
	
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle();
	
}
