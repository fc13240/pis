package ideaStreet.service.impl;

import java.util.List;

import ideaStreet.dao.ArticleDao;
import ideaStreet.dao.ArticleMobileDao;
import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.Vote;
import ideaStreet.service.ArticleMobileService;
import ideaStreet.service.ArticleService;

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
