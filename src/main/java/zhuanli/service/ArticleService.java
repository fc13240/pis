package zhuanli.service;

import java.util.List;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.User;
import zhuanli.domain.Vote;


public interface ArticleService {
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle();
	
	List<ArticleType> getAllArticleTypes();
	
	int getAllArticleCount();
	
	List<Article> articleShow();
	
	Vote getUpVoteAndDownVote(int id);
	
	void praise(Article article);
	
	void slander(Article article);
	
	void addArticleComment(String content, int articleId, int userId);

	List<ArticleComment> getArticleCommentsById(int articleId);
	
	List<Article> articleOrderByCommentsShow();
}
