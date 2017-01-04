package ideaStreet.dao.mybatis;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import ideaStreet.dao.ArticleDao;
import ideaStreet.dao.ArticleMobileDao;
import ideaStreet.dao.mapper.ArticleMapper;
import ideaStreet.dao.mapper.ArticleMobileMapper;
import ideaStreet.domain.Article;
import ideaStreet.domain.ArticleComment;
import ideaStreet.domain.ArticleImg;
import ideaStreet.domain.ArticleSearchCondition;
import ideaStreet.domain.ArticleType;
import ideaStreet.domain.Page;
import ideaStreet.domain.User;
import ideaStreet.domain.Vote;

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
