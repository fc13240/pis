package zhuanli.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import zhuanli.domain.News;
import zhuanli.service.NewsService;



@Controller
@RequestMapping(path="/news")
public class NewsController {
	private NewsService newsService;
	
	@Autowired
	public NewsController(NewsService newsService) {
		this.newsService = newsService;
	}
	
	@RequestMapping(path="/getUserNewsById", method=RequestMethod.GET)
	public String getUserNewsById(@RequestParam("newsId") int newsId,Model model) {
		News news=newsService.getUserNewsById(newsId);
		model.addAttribute("news", news);
		return "";
	}
	
	@RequestMapping(path="/getAllNews", method=RequestMethod.GET)
	public String getAllNews(Model model) {
		List<News> news=newsService.getAllNews();
		model.addAttribute("news", news);
		return "";
	}
	
}
