package zhuanli.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import zhuanli.domain.Article;
import zhuanli.domain.ColumnCount;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.News;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.service.ArticleService;
import zhuanli.service.NewsService;
import zhuanli.service.PatentSearchService;
import zhuanli.service.PatentService;



@Controller
public class IndexController {
	private PatentService patentService;
	private NewsService newsService;
	private ArticleService articleService;
	private PatentSearchService patentSearchService;
	
	@Autowired
	public IndexController(PatentService patentService,NewsService newsService,PatentSearchService patentSearchService,ArticleService articleService) {
		this.patentService = patentService;
		this.newsService=newsService;
		this.articleService=articleService;
		this.patentSearchService=patentSearchService;
	}
	@RequestMapping(path="/index")
	public String getPatents(Model model) {

		List<FirstColumn>  AllColumns=patentService.selectAllColumns();
		List<Patent> patent_list=patentService.getPatents();
		List<News> news=newsService.getNewsShow();
		List<News> newShows=newsService.newsShow();
		//List<Article> article=articleService.getArticleShow();
		List<Article> articleShows=articleService.articleShow();		
		List<Patent> InventionPatentGrant=patentSearchService.searchByInventionPatentGrant();
		List<Patent> abstractsPatent=patentSearchService.searchByAbstractsPatent();
		List<Patent> utilityModelPatent=patentSearchService.searchByUtilityModelPatent();
		List<Patent> appearanceDesignPatent=patentSearchService.searchByAppearanceDesignPatent();
		model.addAttribute("patent_list", patent_list);
		model.addAttribute("AllColumns", AllColumns);
		model.addAttribute("news", news);
		model.addAttribute("newShows", newShows);
		//model.addAttribute("article", article);
		model.addAttribute("articleShows", articleShows);		
		model.addAttribute("IPG", InventionPatentGrant);
		model.addAttribute("AP", abstractsPatent);
		model.addAttribute("UMP", utilityModelPatent);
		model.addAttribute("ADP", appearanceDesignPatent);
		return "index";
	}


}
