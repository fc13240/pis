package ideaStreet.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ideaStreet.domain.Article;
import ideaStreet.domain.News;
import ideaStreet.domain.NewsComment;
import ideaStreet.domain.Page;
import ideaStreet.domain.Patent;
import ideaStreet.service.NewsService;
import ideaStreet.service.PatentService;
import ideaStreet.util.PrincipalUtils;



@Controller
@RequestMapping(path="/news")
public class NewsController {
	private NewsService newsService;
	private PatentService patentService;
	@Autowired
	public NewsController(NewsService newsService,PatentService patentService) {
		this.newsService = newsService;
		this.patentService = patentService;
	}

	@RequestMapping(path="/newsList",method=RequestMethod.GET)
	public String newsList(Page page,Model model) {
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		List<News> news=newsService.getAllNews(page);
		
		int totalCount=newsService.getAllNewsCount();
		page.setTotalRecords(totalCount);
		model.addAttribute("news", news);
		model.addAttribute("page", page);
		return "news_list";
	}	
	@RequestMapping(path="/newsPreview")
	public String newsPreview(@RequestParam("newsId") int newsId,Model model) {
		News news=newsService.getUserNewsById(newsId);
		List<NewsComment> comments = newsService.getNewsCommentsById(newsId);
		
		List<Patent> patents=patentService.getPatents();
		
		List<News> newsRand=newsService.getNewsByRand();
		model.addAttribute("patents", patents);
		model.addAttribute("comments", comments);
		model.addAttribute("news", news);
		model.addAttribute("newsRand", newsRand);
		return "news_preview";
	}		
	
	@RequestMapping(path="/praise", method=RequestMethod.GET)
	public void praise(News news,PrintWriter out){
		int oldUpVote=news.getUpVote();
		news.setUpVote(oldUpVote+1);
		newsService.praise(news);
		out.write(1);
		
	}
	
	@RequestMapping(path="/slander", method=RequestMethod.GET)
	public void slander(News news,PrintWriter out){
		int oldDownVote=news.getDownVote();
		news.setDownVote(oldDownVote+1);
		newsService.slander(news);
		out.write(1);
		
	}
	
	@RequestMapping(path="/comment/addNewsComment", method=RequestMethod.GET)
	public String addNewsComment(String content,int newsId,HttpSession session){
		int userId = PrincipalUtils.getCurrentUserId();
		newsService.addNewsComment(content,newsId,userId);
		return "redirect:/news/newsPreview.html?newsId="+newsId;
	}
	
	
}