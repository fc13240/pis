package ideaStreet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ideaStreet.domain.Article;
import ideaStreet.service.ArticleMobileService;



@Controller
@RequestMapping(path="/mobileArticle")
public class MobileArticleController {
	private ArticleMobileService articleMobileService;
	@Autowired
	public MobileArticleController(ArticleMobileService articleMobileService) {
		this.articleMobileService = articleMobileService;
	}
	
	@RequestMapping(path="/articleList",method=RequestMethod.GET)
	public String articleList(Model model) {
		List<Article> articles=articleMobileService.getAllArticle();
		model.addAttribute("articles", articles);
		return "mobile_article_list";
	}	
	
	@RequestMapping(path="/articlePreview")
	public String articlePreview(@RequestParam("articleId") int articleId,Model model) {
		Article article=articleMobileService.getUserArticleById(articleId);
		model.addAttribute("article", article);
		return "mobile_article_preview";
	}		
	
	
}
