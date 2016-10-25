package zhuanli.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zhuanli.domain.FirstColumn;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.service.NewsService;



@Controller
@RequestMapping(path="/news")
public class NewsController {
	private NewsService newsService;
	
	@Autowired
	public NewsController(NewsService newsService) {
		this.newsService = newsService;
	}
	
	@RequestMapping(path="/newsList",method=RequestMethod.GET)
	public String newsList(Page page, Model model) {
		return "news_list";
	}	
	@RequestMapping(path="/newsPreview")
	public String newsPreview(Page page, Model model) {
		return "news_preview";
	}		
	
}
