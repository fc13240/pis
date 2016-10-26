package zhuanli.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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



@Controller
@RequestMapping(path="/article")
public class ArticleController {
	private ArticleService articleService;
	
	@Autowired
	public ArticleController(ArticleService articleService){
		this.articleService=articleService;
	}
	
	@RequestMapping(path="/list")
	public String getUserArticles(Page page, HttpSession session,Model model){
		UserArticle userArticle=articleService.getUserArticleByPage(page, session);
		model.addAttribute("articles", userArticle.getArticles());
		model.addAttribute("page", userArticle.getPage());
		return "praise";
		
	}

	@RequestMapping(path="/searchArticles", method=RequestMethod.GET)
	public String searchUserNews(@ModelAttribute("searchCondition") ArticleSearchCondition searchCondition, Model model,HttpSession session) {
		UserArticle userArticle=articleService.searchUserArticleByPage(searchCondition, session);
		model.addAttribute("articles", userArticle.getArticles());
		model.addAttribute("page", userArticle.getPage());
		model.addAttribute("articleTypes", userArticle.getArticleTypes());
		return "article_list";
	}
	
	@RequestMapping(path="/getArticleTypeList", method=RequestMethod.GET)
	public String getArticleTypeList(Model model) {
		List<ArticleType> allArticleTypes=articleService.getAllArticleTypes();
		model.addAttribute("allArticleTypes", allArticleTypes);
		return "article_type_list";
	}
	
	@RequestMapping(path="/audit", method=RequestMethod.GET)
	public String audit(Article article){
		articleService.auditArticle(article);
		return "redirect:/article/list.html";
		
	}
	
	@RequestMapping(path="/preview", method=RequestMethod.GET)
	public String preview(int id,Model model){
		Article article=articleService.getUserArticleById(id);
		model.addAttribute("article",article);
		return "article_preview";
		
	}
	
	@RequestMapping(path="/addArticleType", method=RequestMethod.GET)
	public String addArticleType(String keyword,Model model) {
		if(keyword != null && !"".equals(keyword.trim())) {
			articleService.addArticleType(keyword.trim());
		}
		return "redirect:/article/getArticleTypeList.html";
	}
	
	@RequestMapping(path="/deleteArticleType", method=RequestMethod.GET)
	public void deleteArticleType(int typeId) {
		articleService.deleteArticleType(typeId);
	}
	
	@RequestMapping(path="/updateArticleType", method=RequestMethod.GET)
	public String updateArticleType(int typeId,String typeName) {
		articleService.updateArticleType(typeId,typeName);
		return "article_type_list";
	}
	
	@RequestMapping(path="/deleteArticle")
	public String deleteArticle(int articleId){
		articleService.deleteArticle(articleId);		
		return "redirect:/article/list.html";
		
	}
	@RequestMapping(path="/addArticleForm")
	public String addNewsForm(Model model) {
		int userId = PrincipalUtils.getCurrentUserId();
		Article article = new Article();
		User user =new User();
		user.setUserId(userId);
		article.setUser(user);
		articleService.insertArticle(article);
		List<ArticleType> articleTypes=articleService.getAllArticleTypes();
		model.addAttribute("articleId", article.getId());
		model.addAttribute("articleTypes", articleTypes);
		return "article_add";
	}	
	
	@RequestMapping(path="/praise")
	public String praise(int articleId){
		
		articleService.deleteArticle(articleId);		
		return "redirect:/article/list.html";
		
	}
	
}
