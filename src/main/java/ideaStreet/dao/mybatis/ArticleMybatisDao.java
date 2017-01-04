package ideaStreet.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import ideaStreet.dao.ArticleDao;
import ideaStreet.dao.mapper.ArticleMapper;
import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleImg;
import ideaStreet.domain.ArticleSearchCondition;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.User;
import ideaStreet.domain.Vote;

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
	public List<Article> getArticleByRand() {
		return articleMapper.getArticleByRand();
	}

}
