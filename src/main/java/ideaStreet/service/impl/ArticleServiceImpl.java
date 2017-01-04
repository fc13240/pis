package ideaStreet.service.impl;

import java.util.List;

import ideaStreet.dao.ArticleDao;
import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.Vote;
import ideaStreet.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	private ArticleDao articleDao;

	public ArticleServiceImpl(ArticleDao articleDao) {
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
