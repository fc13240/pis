package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.ArticleDao;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.service.ArticleService;



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
	
	
}
