package zhuanli.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zhuanli.domain.Article;
import zhuanli.domain.Page;
import zhuanli.service.ArticleService;



@Controller
@RequestMapping(path="/article")
public class ArticleController {
	private ArticleService articleService;
	
	@Autowired
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}

	@RequestMapping(path="/articleList",method=RequestMethod.GET)
	public String articleList(Page page,Model model) {
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		List<Article> article=articleService.getAllArticle(page);
		int totalCount=articleService.getAllArticleCount();
		page.setTotalRecords(totalCount);
		model.addAttribute("article", article);
		model.addAttribute("page", page);
		return "article_list";
	}	
	@RequestMapping(path="/articlePreview")
	public String articlePreview(@RequestParam("articleId") int articleId,Model model) {
		Article article=articleService.getUserArticleById(articleId);
		model.addAttribute("article", article);
		return "article_preview";
	}		


	
}
