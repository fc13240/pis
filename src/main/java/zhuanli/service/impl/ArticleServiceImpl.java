package zhuanli.service.impl;

import java.util.ArrayList;
import java.util.List;

import zhuanli.dao.ArticleDao;
import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.User;
import zhuanli.service.ArticleService;


import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.fabric.xmlrpc.base.Array;

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
	public List<Article> getArticleShow() {
		return articleDao.getArticleShow();
	}

	@Override
	public Article getUserArticleById(int userId) {
		return articleDao.getUserArticleById(userId);
	}

	@Override
	public List<Article> getAllArticle() {
		return articleDao.getAllArticle();
		
	}
	


	@Override
	public List<ArticleType> getAllArticleTypes() {
		return articleDao.getAllArticleTypes();
	}

	@Override
	public int getAllArticleCount() {
		return articleDao.getAllArticleCount();
	}

	@Override
	public List<Article> articleShow() {
		List<Article> timeArticles=articleDao.articleOrderByTimeShow();
		List<Article> commentsArticles=articleDao.articleOrderByCommentsShow();
		if(timeArticles.isEmpty()){
			return timeArticles;
		}else{
		if(timeArticles.size()<10){
			for (int i = 0; i < 10-timeArticles.size()-1; i++) {
			timeArticles.add(commentsArticles.get(i));
			}
		}	
		}
		return timeArticles;
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
	
	@Override
	public void addArticleComment(String content, int articleId, int userId) {
		articleDao.addArticleComment(content, articleId, userId);
		
	}
	
	@Override
	public List<ArticleComment> getArticleCommentsById(int articleId) {
		return articleDao.getArticleCommentsById(articleId);
	}

	@Override
	public List<Article> articleOrderByCommentsShow() {
		return articleDao.articleOrderByCommentsShow();
	}

	
}
