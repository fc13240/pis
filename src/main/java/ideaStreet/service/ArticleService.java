package ideaStreet.service;

import java.util.List;

import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.User;
import ideaStreet.domain.Vote;


public interface ArticleService {
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle(Page page);
	
	List<ArticleType> getAllArticleTypes();
	
	int getAllArticleCount();
	
	List<Article> articleShow();
	
	Vote getUpVoteAndDownVote(int id);
	
	void praise(Article article);
	
	void slander(Article article);
	
	void addArticleComment(String content, int articleId, int userId);

	List<ArticleComment> getArticleCommentsById(int articleId);
	
	List<Article> getArticleByRand();
}
