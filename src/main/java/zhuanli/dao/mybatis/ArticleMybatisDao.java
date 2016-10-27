package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.ArticleDao;
import zhuanli.dao.mapper.ArticleMapper;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.ArticleImg;
import zhuanli.domain.ArticleSearchCondition;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Vote;

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
	public Vote getUpVoteAndDownVote(int id) {
		return articleMapper.getUpVoteAndDownVote(id);
	}

	@Override
	public void praise(Article article) {
		articleMapper.praise(article);
	}

	@Override
	public void slander(Article article) {
		articleMapper.slander(article);
	}

	@Override
	public List<ArticleType> getAllArticleTypes() {
		articleMapper.getAllArticleTypes();
		return null;
	}

	@Override
	public int getAllArticleCount() {
		articleMapper.getAllArticleCount();
		return 0;
	}

	@Override
	public List<Article> articleShow() {
		articleMapper.articleShow();
		return null;
	}
}
