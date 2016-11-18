package zhuanli.service.impl;

import java.util.List;

import zhuanli.dao.ArticleDao;
import zhuanli.dao.ArticleMobileDao;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Vote;
import zhuanli.service.ArticleMobileService;
import zhuanli.service.ArticleService;

public class ArticleMobileServiceImpl implements ArticleMobileService{
	private ArticleMobileDao articleMobileDao;

	public ArticleMobileServiceImpl(ArticleMobileDao articleMobileDao) {
		this.articleMobileDao = articleMobileDao;
	}

	@Override
	public List<Article> getArticleShow() {
		
		return articleMobileDao.getArticleShow();
	}

	@Override
	public Article getUserArticleById(int userId) {
		
		return articleMobileDao.getUserArticleById(userId);
	}

	@Override
	public List<Article> getAllArticle() {
		
		return articleMobileDao.getAllArticle();
	}


	
}
