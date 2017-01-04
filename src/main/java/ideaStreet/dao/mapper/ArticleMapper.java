package ideaStreet.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.Vote;



public interface ArticleMapper {
	
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle(Page page);
	
	List<ArticleType> getAllArticleTypes();
	
	int getAllArticleCount();
	
	List<Article> articleShow();

	Vote getUpVoteAndDownVote(int id);
	
	void praise(Article article);
	
	void slander(Article article);
	
	void addArticleComment(@Param("content")String content, @Param("articleId") int articleId,@Param("userId") int userId);

	List<ArticleComment> getArticleCommentsById(int articleId);
	
	List<Article> getArticleByRand();
}
