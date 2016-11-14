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


	
}
