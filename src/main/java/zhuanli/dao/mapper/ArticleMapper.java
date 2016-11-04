package zhuanli.dao.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.User;
import zhuanli.domain.Vote;



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
	
}
