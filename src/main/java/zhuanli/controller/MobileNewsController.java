package zhuanli.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zhuanli.domain.News;
import zhuanli.service.NewsMobileService;

@Controller
@RequestMapping(path="/mobileNews")
public class MobileNewsController {
	private NewsMobileService newsMobileService;
	@Autowired
	public MobileNewsController(NewsMobileService newsMobileService) {
		this.newsMobileService = newsMobileService;
	}
	
	@RequestMapping(path="/newsList",method=RequestMethod.GET)
	public String newsList(Model model) {
		List<News> news=newsMobileService.getAllNews();		
		model.addAttribute("news", news);
		return "mobile_news_list";
	}
	
	@RequestMapping(path="/newsPreview")
	public String newsPreview(int newsId,Model model) {
		News news=newsMobileService.getUserNewsById(newsId);
		model.addAttribute("news", news);
		return "mobile_news_preview";
	}		
	
}
