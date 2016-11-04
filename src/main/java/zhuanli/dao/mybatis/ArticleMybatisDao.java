package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.ArticleDao;
import zhuanli.dao.mapper.ArticleMapper;
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
	public List<Article> getAllArticle() {
		return articleMapper.getAllArticle();
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
	
	@Override
	public void addArticleComment(String content, int articleId, int userId) {
		articleMapper.addArticleComment(content, articleId, userId);
		
	}
	
	@Override
	public List<ArticleComment> getArticleCommentsById(int articleId) {
		return articleMapper.getArticleCommentsById(articleId);
	}

	@Override
	public List<Article> articleOrderByTimeShow() {
		return articleMapper.articleOrderByTimeShow();
	}

	@Override
	public List<Article> articleOrderByCommentsShow() {
		return articleMapper.articleOrderByCommentsShow();
	}

	@Override
	public List<Article> getArticleByRand() {
		return articleMapper.getArticleByRand();
	}
}
