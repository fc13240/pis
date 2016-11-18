package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.ArticleDao;
import zhuanli.dao.ArticleMobileDao;
import zhuanli.dao.mapper.ArticleMapper;
import zhuanli.dao.mapper.ArticleMobileMapper;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.User;
import zhuanli.domain.ArticleImg;
import zhuanli.domain.ArticleSearchCondition;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Vote;

public class ArticleMobileMybatisDao extends SqlSessionDaoSupport implements ArticleMobileDao{
	private ArticleMobileMapper articleMobileMapper;
	
	public void setArticleMobileMapper(ArticleMobileMapper articleMobileMapper) {
		this.articleMobileMapper = articleMobileMapper;
	}

	@Override
	public List<Article> getArticleShow() {
		
		return articleMobileMapper.getArticleShow();
	}

	@Override
	public Article getUserArticleById(int userId) {
		
		return articleMobileMapper.getUserArticleById(userId);
	}

	@Override
	public List<Article> getAllArticle() {
		return articleMobileMapper.getAllArticle();
	}

}
