package zhuanli.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.User;
import zhuanli.service.ArticleMobileService;
import zhuanli.service.ArticleService;
import zhuanli.service.PatentService;
import zhuanli.util.PrincipalUtils;



@Controller
@RequestMapping(path="/articleMobile")
public class MobileArticleController {
	private ArticleMobileService articleMobileService;
	@Autowired
	public MobileArticleController(ArticleMobileService articleMobileService) {
		this.articleMobileService = articleMobileService;
	}

	
	
}
