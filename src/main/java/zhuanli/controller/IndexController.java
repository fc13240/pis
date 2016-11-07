package zhuanli.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zhuanli.domain.Article;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.News;
import zhuanli.domain.Patent;
import zhuanli.service.ArticleService;
import zhuanli.service.NewsService;
import zhuanli.service.PatentSearchService;
import zhuanli.service.PatentService;
import zhuanli.util.WeixinMessageDigest;



@Controller
public class IndexController {
	private PatentService patentService;
	private NewsService newsService;
	private ArticleService articleService;
	private PatentSearchService patentSearchService;
	
	@Autowired
	public IndexController(PatentService patentService,NewsService newsService,PatentSearchService patentSearchService,ArticleService articleService) {
		this.patentService = patentService;
		this.newsService=newsService;
		this.articleService=articleService;
		this.patentSearchService=patentSearchService;
	}
	@RequestMapping(path="/index")
	public String getPatents(HttpServletRequest req, HttpServletResponse resp,Model model) {

		List<FirstColumn>  AllColumns=patentService.selectAllColumns();
		List<Patent> patent_list=patentService.getPatents();
		List<News> news=newsService.getNewsShow();
		List<News> newShows=newsService.newsShow();
		//List<Article> article=articleService.getArticleShow();
		List<Article> articleShows=articleService.articleShow();		
		List<Patent> InventionPatentGrant=patentSearchService.searchByInventionPatentGrant();
		List<Patent> abstractsPatent=patentSearchService.searchByAbstractsPatent();
		List<Patent> utilityModelPatent=patentSearchService.searchByUtilityModelPatent();
		List<Patent> appearanceDesignPatent=patentSearchService.searchByAppearanceDesignPatent();
		model.addAttribute("patent_list", patent_list);
		model.addAttribute("AllColumns", AllColumns);
		model.addAttribute("news", news);
		model.addAttribute("newShows", newShows);
		//model.addAttribute("article", article);
		model.addAttribute("articleShows", articleShows);		
		model.addAttribute("IPG", InventionPatentGrant);
		model.addAttribute("AP", abstractsPatent);
		model.addAttribute("UMP", utilityModelPatent);
		model.addAttribute("ADP", appearanceDesignPatent);
		return "index";
	}
	
	@RequestMapping(path="/token")
	public void weiXin(HttpServletRequest req, HttpServletResponse resp){
		PrintWriter pw = null;
		try{
			 pw = resp.getWriter();
			System.out.println("请求到来");
		       resp.setCharacterEncoding("GBK");
		       // 微信加密签名 
		        String signature = req.getParameter("signature"); 
		        System.out.println(signature);
		        // 时间戳 
		        String timestamp = req.getParameter("timestamp");
		        System.out.println(timestamp);
		        // 随机数 
		        String nonce = req.getParameter("nonce"); 
		        System.out.println(nonce);
		        // 随机字符串  
		        String echostr = req.getParameter("echostr");
		        WeixinMessageDigest wxDigest = WeixinMessageDigest.getInstance();  
		        boolean bValid = wxDigest.validate(signature, timestamp, nonce);
		       
		        if(bValid){
		 	        pw.write(echostr);  //这里 echostr 的值必须返回，否则微信认为请求失败
		        }else{
		        	 pw.write("token 验证失败!");
		        }
		       
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			 pw.flush();
	 	     pw.close();
		}
			
	}

	@RequestMapping(path="/weChat")
	public String weChat(){
		return "weChat_from";
	}
	
}
