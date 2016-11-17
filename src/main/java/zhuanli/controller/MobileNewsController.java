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

import zhuanli.domain.News;
import zhuanli.domain.NewsComment;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.service.NewsMobileService;
import zhuanli.service.PatentService;
import zhuanli.util.PrincipalUtils;

@Controller
@RequestMapping(path="/mobileNews")
public class MobileNewsController {
	private NewsMobileService newsMobileService;
	@Autowired
	public MobileNewsController(NewsMobileService newsMobileService) {
		this.newsMobileService = newsMobileService;
	}
	
	@RequestMapping(path="/newsList",method=RequestMethod.GET)
	public String newsList(Page page,Model model) {
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		List<News> news=newsMobileService.getAllNews(page);		
		int totalCount=newsMobileService.getAllNewsCount();
		page.setTotalRecords(totalCount);
		model.addAttribute("news", news);
		model.addAttribute("page", page);
		return "mobile_news_list";
	}	
	@RequestMapping(path="/newsPreview")
	public String newsPreview(@RequestParam("newsId") int newsId,Model model) {
		News news=newsMobileService.getUserNewsById(newsId);
		List<NewsComment> comments = newsMobileService.getNewsCommentsById(newsId);
		List<News> newsRand=newsMobileService.getNewsByRand();
		model.addAttribute("comments", comments);
		model.addAttribute("news", news);
		model.addAttribute("newsRand", newsRand);
		return "mobile_news_preview";
	}	
	
	@RequestMapping(path="/praise", method=RequestMethod.GET)
	public void praise(News news,PrintWriter out){
		int oldUpVote=news.getUpVote();
		news.setUpVote(oldUpVote+1);
		newsMobileService.praise(news);
		out.write(1);
		
	}
	
	@RequestMapping(path="/slander", method=RequestMethod.GET)
	public void slander(News news,PrintWriter out){
		int oldDownVote=news.getDownVote();
		news.setDownVote(oldDownVote+1);
		newsMobileService.slander(news);
		out.write(1);
		
	}
	
	@RequestMapping(path="/comment/addNewsComment", method=RequestMethod.GET)
	public String addNewsComment(String content,int newsId,HttpSession session){
		int userId = PrincipalUtils.getCurrentUserId();
		newsMobileService.addNewsComment(content,newsId,userId);
		return "redirect:/news/newsPreview.html?newsId="+newsId;
	}
	
	
}
