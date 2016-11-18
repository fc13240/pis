package zhuanli.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Vote;



public interface ArticleMobileMapper {
	
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle();
	
}
