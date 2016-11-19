package zhuanli.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zhuanli.domain.Article;
import zhuanli.domain.News;
import zhuanli.service.ArticleMobileService;
import zhuanli.service.NewsMobileService;

@Controller
@RequestMapping(path="/mobile")
public class MobileIndexController {
	private ArticleMobileService articleMobileService;
	private NewsMobileService newsMobileService;
	@Autowired
	public MobileIndexController(NewsMobileService newsMobileService, ArticleMobileService articleMobileService) {
		this.articleMobileService=articleMobileService;
		this.newsMobileService = newsMobileService;
	}
	
	@RequestMapping(path="/index",method=RequestMethod.GET)
	public String newsList(Model model) {
		List<News> imageNews = newsMobileService.mobileIndexImageNewsShow();
		List<News> news = newsMobileService.mobileIndexNewsShow();
		model.addAttribute("imageNews",imageNews);
		model.addAttribute("news",news);
		List<Article> articles=articleMobileService.getArticleShow();
		model.addAttribute("articles", articles);
		return "mobile_index";
	}	
	
}
