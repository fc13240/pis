package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.ArticleDao;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Vote;
import zhuanli.service.ArticleService;

public class ArticleMobileServiceImpl implements ArticleService {
	private ArticleDao articleDao;

	public ArticleMobileServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public List<Article> getArticleShow() {
		return articleDao.getArticleShow();
	}

	@Override
	public Article getUserArticleById(int userId) {
		return articleDao.getUserArticleById(userId);
	}

	@Override
	public List<Article> getAllArticle(Page page) {
		return articleDao.getAllArticle(page);
		
	}
	
	@Override
	public List<ArticleType> getAllArticleTypes() {
		return articleDao.getAllArticleTypes();
	}

	@Override
	public int getAllArticleCount() {
		return articleDao.getAllArticleCount();
	}

	@Override
	public List<Article> articleShow() {
		return articleDao.articleShow();
	}
	


	@Override
	public Vote getUpVoteAndDownVote(int id) {
		return articleDao.getUpVoteAndDownVote(id);
	}

	@Override
	public void praise(Article article) {
		articleDao.praise(article);
	}

	@Override
	public void slander(Article article) {
		articleDao.slander(article);
	}
	
	@Override
	public void addArticleComment(String content, int articleId, int userId) {
		articleDao.addArticleComment(content, articleId, userId);
		
	}
	
	@Override
	public List<ArticleComment> getArticleCommentsById(int articleId) {
		return articleDao.getArticleCommentsById(articleId);
	}



	@Override
	public List<Article> getArticleByRand() {
		return articleDao.getArticleByRand();
	}

	
}
