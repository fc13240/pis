package zhuanli.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import zhuanli.domain.Article;
import zhuanli.domain.Page;
import zhuanli.service.ArticleService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleSearchCondition;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.User;
import zhuanli.domain.UserArticle;
import zhuanli.service.ArticleService;
import zhuanli.util.PrincipalUtils;
import zhuanli.util.WebUtils;



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
	
	@RequestMapping(path="/addArticleComment", method=RequestMethod.GET)
	public void addArticleComment(String content,int articleId){
		//int userId = PrincipalUtils.getCurrentUserId();
		articleService.addArticleComment(content,articleId,27);
		
	}
	
	@RequestMapping(path="/checkUser", method=RequestMethod.GET)
	public void checkUser(String username,String password,HttpServletResponse response) throws IOException{
		User user = articleService.checkUser(username,password);
		WebUtils.writeJsonStrToResponse(response, user.getUserId());
	}
}
