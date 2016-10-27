package zhuanli.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.ArticleDao;
import zhuanli.dao.mapper.ArticleMapper;
import zhuanli.domain.Article;
<<<<<<< HEAD
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
=======
import zhuanli.domain.ArticleImg;
import zhuanli.domain.ArticleSearchCondition;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Vote;

>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727


public class ArticleMybatisDao extends SqlSessionDaoSupport implements ArticleDao{
	private ArticleMapper articleMapper;

	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	@Override
<<<<<<< HEAD
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
=======
	public List<Article> getUserArticleByPage(Page page) {
		return articleMapper.getUserArticleByPage(page);
	}

	@Override
	public int getUserArticleCount(int userId) {
		return articleMapper.getUserArticleCount(userId);
	}
	
	@Override
	public void addArticleType(String keyword) {
		articleMapper.addArticleType(keyword);
		
	}

	@Override
	public void deleteArticleType(int typeId) {
		articleMapper.deleteArticleType(typeId);
		
	}

	@Override
	public void updateArticleType(int typeId, String typeName) {
		articleMapper.updateArticleType(typeId,typeName);
		
	}

	@Override
	public void deleteArticle(int articleId) {
		articleMapper.deleteArticle(articleId);
		
	}



	@Override
	public List<Article> searchUserArticleByPage(ArticleSearchCondition searchCondition) {
		return articleMapper.searchUserArticleByPage(searchCondition);
>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
	}

	@Override
	public List<ArticleType> getAllArticleTypes() {
		return articleMapper.getAllArticleTypes();
	}

	@Override
<<<<<<< HEAD
	public int getAllArticleCount() {
		return articleMapper.getAllArticleCount();
	}

	@Override
	public List<Article> articleShow() {
		return articleMapper.articleShow();
	}

=======
	public int searchUserArticleCount(ArticleSearchCondition searchCondition) {
		return articleMapper.searchUserArticleCount(searchCondition);
	}

	@Override
	public void auditPass(Article article) {
		articleMapper.auditPass(article);
	}

	@Override
	public Article getUserArticleById(int id) {
		return articleMapper.getUserArticleById(id);
	}

	@Override
	public void insertArticle(Article article) {
		articleMapper.insertArticle(article);
	}

	@Override
	public void updateArticle(Article article) {
		articleMapper.updateArticle(article);
		
	}

	@Override
	public void addArticleImage(ArticleImg articleImg) {
		articleMapper.addArticleImage(articleImg);
		
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

	



>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
	
}
