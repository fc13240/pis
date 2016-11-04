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
import zhuanli.service.ArticleService;
import zhuanli.service.PatentService;
import zhuanli.util.PrincipalUtils;



@Controller
@RequestMapping(path="/article")
public class ArticleController {
	private ArticleService articleService;
	private PatentService patentService;
	@Autowired
	public ArticleController(ArticleService articleService,PatentService patentService) {
		this.articleService = articleService;
		this.patentService = patentService;
	}

	@RequestMapping(path="/articleList",method=RequestMethod.GET)
	public String articleList(Page page,Model model) {
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		List<Article> articles=articleService.getAllArticle(page);
		int totalCount=articleService.getAllArticleCount();
		page.setTotalRecords(totalCount);
		model.addAttribute("article", articles);
		model.addAttribute("page", page);
		return "article_list";
	}	
	@RequestMapping(path="/articlePreview")
	public String articlePreview(@RequestParam("articleId") int articleId,Model model) {
		Article article=articleService.getUserArticleById(articleId);
		List<ArticleComment> comments = articleService.getArticleCommentsById(articleId);
		
		List<Patent> patents=patentService.getPatents();
		List<Article> articles=articleService.getArticleByRand();
		model.addAttribute("comments", comments);
		model.addAttribute("article", article);
		model.addAttribute("articles", articles);
		model.addAttribute("patents", patents);
		return "article_preview";
	}		
	
	@RequestMapping(path="/getArticleTypeList", method=RequestMethod.GET)
	public String getArticleTypeList(Model model) {
		List<ArticleType> allArticleTypes=articleService.getAllArticleTypes();
		model.addAttribute("allArticleTypes", allArticleTypes);
		return "article_type_list";
	}
	
	@RequestMapping(path="/preview", method=RequestMethod.GET)
	public String preview(int id,Model model){
		Article article=articleService.getUserArticleById(id);
		model.addAttribute("article",article);
		return "article_preview";
		
	}
	
	@RequestMapping(path="/praise", method=RequestMethod.GET)
	public void praise(Article article,PrintWriter out){
		int oldUpVote=article.getUpVote();
		article.setUpVote(oldUpVote+1);
		articleService.praise(article);
		out.write(1);
		
	}
	
	@RequestMapping(path="/slander", method=RequestMethod.GET)
	public void slander(Article article,PrintWriter out){
		int oldDownVote=article.getDownVote();
		article.setDownVote(oldDownVote+1);
		articleService.slander(article);
		out.write(1);
		
	}
	
	@RequestMapping(path="/comment/addArticleComment", method=RequestMethod.GET)
	public String addArticleComment(String content,int articleId,HttpSession session){
		int userId = PrincipalUtils.getCurrentUserId();
		articleService.addArticleComment(content,articleId,userId);
		return "redirect:/article/articlePreview.html?articleId="+articleId;
	}
	
}
