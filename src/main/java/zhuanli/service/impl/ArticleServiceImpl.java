package zhuanli.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import zhuanli.controller.util.FileOption;
import zhuanli.controller.util.WebUtils;
import zhuanli.dao.ArticleDao;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleImg;
import zhuanli.domain.ArticleSearchCondition;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.UserArticle;
import zhuanli.domain.Vote;
import zhuanli.service.ArticleService;
import zhuanli.util.PrincipalUtils;

public class ArticleServiceImpl implements ArticleService {
	private ArticleDao articleDao;

	public ArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public UserArticle getUserArticleByPage(Page page, HttpSession session) {
		int userId = PrincipalUtils.getCurrentUserId();
		page.setUserId(userId);
		page.setPageSize(WebUtils.getPageSize(session));
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		int totalCount=articleDao.getUserArticleCount(userId);
		page.setTotalRecords(totalCount);
		List<Article> articles=articleDao.getUserArticleByPage(page);
		UserArticle userArticle=new UserArticle();
		userArticle.setPage(page);
		userArticle.setArticles(articles);
		return userArticle;
	}

	@Override
	public UserArticle searchUserArticleByPage(ArticleSearchCondition articleSearchCondition, HttpSession session) {
		int userId = PrincipalUtils.getCurrentUserId();
		Page page=articleSearchCondition.getPage();
		page.setUserId(userId);
		page.setPageSize(WebUtils.getPageSize(session));
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		articleSearchCondition.setUserId(PrincipalUtils.getCurrentUserId());
		int totalCount=articleDao.searchUserArticleCount(articleSearchCondition);
		page.setTotalRecords(totalCount);
		List<Article> articles=articleDao.searchUserArticleByPage(articleSearchCondition);

		List<ArticleType> articleTypes=articleDao.getAllArticleTypes();
		UserArticle userArticle=new UserArticle();
		userArticle.setPage(page);
		userArticle.setArticles(articles);
		userArticle.setArticleTypes(articleTypes);
		return userArticle;
	}

	@Override
	public List<ArticleType> getAllArticleTypes() {
		return articleDao.getAllArticleTypes();
	}

	@Override
	public void auditArticle(Article article) {
		articleDao.auditPass(article);
	}

	@Override
	public Article getUserArticleById(int id) {
		Article article=articleDao.getUserArticleById(id);
		return article;
	}
	
	@Override
	public void addArticleType(String keyword) {
		articleDao.addArticleType(keyword);
		
	}

	@Override
	public void deleteArticleType(int typeId) {
		articleDao.deleteArticleType(typeId);
		
	}

	@Override
	public void updateArticleType(int typeId, String typeName) {
		articleDao.updateArticleType(typeId,typeName);
		
	}

	@Override
	public void deleteArticle(int articleId) {
		articleDao.deleteArticle(articleId);
		
	}

	@Override
	public void insertArticle(Article article) {
		articleDao.insertArticle(article);
	}

	@Override
	public void updateArticle(Article article) {
		articleDao.updateArticle(article);
		
	}

	@Override
	@Transactional
	public void insertArticleImage(ArticleImg articleImg,MultipartFile multipartFile) {
		String defaultSaveDir ="";
		String defaultSaveUrl = "";
		int userId = PrincipalUtils.getCurrentUserId();
		String saveImageUrl = FileOption.uploaffile(userId, multipartFile, defaultSaveDir, defaultSaveUrl);
		articleImg.setImgUrl(saveImageUrl);
		articleDao.addArticleImage(articleImg);
	}

	@Override
	public Vote getUpVoteAndDownVote(int id) {
		return articleDao.getUpVoteAndDownVote(id);
	}

	@Override
	public void praise(Article article) {
		articleDao.praise(article);
	}

	@Override
	public void slander(Article article) {
		articleDao.slander(article);
	}

	
}
