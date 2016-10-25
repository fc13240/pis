package zhuanli.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD

import zhuanli.domain.FirstColumn;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
=======
import org.springframework.web.bind.annotation.RequestParam;

import zhuanli.domain.News;
>>>>>>> 063b71b22c6cc9a9c5b78eaf37f7e78115905288
import zhuanli.service.NewsService;



@Controller
@RequestMapping(path="/news")
public class NewsController {
	private NewsService newsService;
	
	@Autowired
	public NewsController(NewsService newsService) {
		this.newsService = newsService;
	}
	
<<<<<<< HEAD
	@RequestMapping(path="/newsList",method=RequestMethod.GET)
	public String newsList(Page page, Model model) {
		return "news_list";
	}	
	@RequestMapping(path="/newsPreview")
	public String newsPreview(Page page, Model model) {
		return "news_preview";
	}		
=======
	@RequestMapping(path="/getUserNewsById", method=RequestMethod.GET)
	public String getUserNewsById(@RequestParam("newsId") int newsId,Model model) {
		News news=newsService.getUserNewsById(newsId);
		model.addAttribute("news", news);
		return "";
	}
	
	@RequestMapping(path="/getUserNewsById", method=RequestMethod.GET)
	public String getAllNews(Model model) {
		List<News> news=newsService.getAllNews();
		model.addAttribute("news", news);
		return "";
	}
>>>>>>> 063b71b22c6cc9a9c5b78eaf37f7e78115905288
	
}
