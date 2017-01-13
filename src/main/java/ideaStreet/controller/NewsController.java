package ideaStreet.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import ideaStreet.domain.Brand;
import ideaStreet.domain.News;
import ideaStreet.domain.NewsComment;
import ideaStreet.domain.NewsSearchCondition;
import ideaStreet.domain.NewsType;
import ideaStreet.domain.Page;
import ideaStreet.domain.Patent;
import ideaStreet.service.BrandService;
import ideaStreet.service.NewsService;
import ideaStreet.service.PatentService;
import ideaStreet.util.PrincipalUtils;



@Controller
@RequestMapping(path="/news")
public class NewsController {
	private NewsService newsService;
	private PatentService patentService;
	private BrandService brandService;
	@Autowired
	public NewsController(NewsService newsService,PatentService patentService, BrandService brandService) {
		this.newsService = newsService;
		this.patentService = patentService;
		this.brandService = brandService;
	}

	@RequestMapping(path="/newsList",method=RequestMethod.GET)
	public String newsList(int typeId, Page page, Model model) {
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		List<News> news = newsService.getNewsListByType(typeId,page);
		int totalCount = newsService.getNewsListByTypeCount(typeId);
		page.setTotalRecords(totalCount);
		List<Patent> patents = patentService.getPatents();
		List<Brand> brands = brandService.getIndexSlideBrands();
		NewsType newsType = newsService.getNewsTypeById(typeId);
		model.addAttribute("patents", patents);
		model.addAttribute("news", news);
		model.addAttribute("brands", brands);
		model.addAttribute("page", page);
		model.addAttribute("newsType", newsType);
		return "news_list";
	}
	
	@RequestMapping(path="/newsOriginalityList",method=RequestMethod.GET)
	public String newsOriginalityList(Page page,Model model) {
		List<News> hotNews=newsService.getHomepageByType(1,5);
		List<News> technologyNews=newsService.getHomepageByType(2,8);
		List<News> cartoonNews=newsService.getHomepageByType(3,4);
		List<News> laughNews=newsService.getHomepageByType(4,4);
		List<News> creativeLifeNews=newsService.getHomepageByType(5,20);
		List<News> creativePrductNews=newsService.getHomepageByType(6,20);
		List<News> creativeDesignNews=newsService.getHomepageByType(7,20);

		
		model.addAttribute("hotNews", hotNews);
		model.addAttribute("technologyNews", technologyNews);
		model.addAttribute("cartoonNews", cartoonNews);
		model.addAttribute("laughNews", laughNews);
		
		model.addAttribute("creativeLifeNews", creativeLifeNews);
		model.addAttribute("creativePrductNews", creativePrductNews);
		model.addAttribute("creativeDesignNews", creativeDesignNews);
		


		return "news_originality_list";
	}	


	@RequestMapping(path="/newsBusinessList",method=RequestMethod.GET)
	public String newsBusinessList(Page page,Model model) {
		List<News> hotNews=newsService.getHomepageByType(1,5);
		List<News> technologyNews=newsService.getHomepageByType(2,8);
		List<News> cartoonNews=newsService.getHomepageByType(3,4);
		List<News> laughNews=newsService.getHomepageByType(4,4);

		
		List<News> businessSay=newsService.getHomepageByType(8,20);
		List<News> businessNews=newsService.getHomepageByType(9,20);
		List<News> businessPolicy=newsService.getHomepageByType(10,20);
		

		
		model.addAttribute("hotNews", hotNews);
		model.addAttribute("technologyNews", technologyNews);
		model.addAttribute("cartoonNews", cartoonNews);
		model.addAttribute("laughNews", laughNews);
		

		
		model.addAttribute("businessSay", businessSay);
		model.addAttribute("businessNews", businessNews);
		model.addAttribute("businessPolicy", businessPolicy);
		
	
		return "news_business_list";
	}	

	@RequestMapping(path="/newsPatentList",method=RequestMethod.GET)
	public String newsPatentList(Page page,Model model) {


		List<News> patentNews=newsService.getHomepageByType(11,20);
		List<News> patentStudy=newsService.getHomepageByType(12,20);
		List<News> brandNews=newsService.getHomepageByType(13,20);
		List<News> brandStudy=newsService.getHomepageByType(14,20);	

		model.addAttribute("patentNews", patentNews);
		model.addAttribute("patentStudy", patentStudy);
		model.addAttribute("brandNews", brandNews);
		model.addAttribute("brandStudy", brandStudy);	
		return "news_patent_list";
	}	

	@RequestMapping(path="/newsPreview")
	public String newsPreview(@RequestParam("newsId") int newsId,Model model) {
		News news=newsService.getUserNewsById(newsId);
		List<NewsComment> comments = newsService.getNewsCommentsById(newsId);
		
		List<Patent> patents=patentService.getPatents();
		List<Brand> brands = brandService.getIndexSlideBrands();
		List<News> newsRand=newsService.getNewsByRand();
		model.addAttribute("patents", patents);
		model.addAttribute("comments", comments);
		model.addAttribute("news", news);
		model.addAttribute("brands", brands);
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
	
	@RequestMapping(path="/comment/addNewsComment")
	public String addNewsComment(String content,int newsId,HttpSession session){
		//int userId = PrincipalUtils.getCurrentUserId();
		newsService.addNewsComment(content,newsId,2);
		return "redirect:/news/newsPreview.html?newsId="+newsId;
	}
	
	
	@RequestMapping(path="/searchNews", method=RequestMethod.GET)
	public String searchUserNews(@ModelAttribute("searchCondition") NewsSearchCondition searchCondition, Model model,HttpSession session) {
		Page page=searchCondition.getPage();
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		List<News> news=newsService.searchNewsByPage(searchCondition);
		int totalCount=newsService.searchNewsByCount(searchCondition);
		page.setTotalRecords(totalCount);
		List<NewsType> allNewsType=newsService.getAllNewsTypes();
		model.addAttribute("news", news);
		model.addAttribute("page", page);
		model.addAttribute("keyword", searchCondition.getKeyword());
		model.addAttribute("allNewsType", allNewsType);

		return "news_search_list";

	}
	
}
