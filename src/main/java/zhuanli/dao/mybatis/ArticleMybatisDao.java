package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.ArticleDao;
import zhuanli.dao.mapper.ArticleMapper;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;


public class ArticleMybatisDao extends SqlSessionDaoSupport implements ArticleDao{
	private ArticleMapper articleMapper;

	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	@Override
	public List<Article> getArticleShow() {
		return articleMapper.getArticleShow();
	}

	@Override
	public Article getUserArticleById(int userId) {
		return articleMapper.getUserArticleById(userId);
	}

	@Override
	public List<Article> getAllArticle(Page page) {
		return articleMapper.getAllArticle(page);
	}

	@Override
	public List<ArticleType> getAllArticleTypes() {
		return articleMapper.getAllArticleTypes();
	}

	@Override
	public int getAllArticleCount() {
		return articleMapper.getAllArticleCount();
	}

	@Override
	public List<Article> articleShow() {
		return articleMapper.articleShow();
	}

	
}
