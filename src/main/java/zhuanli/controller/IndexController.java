package zhuanli.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qq.connect.QQConnectException;
import com.qq.connect.api.OpenID;
import com.qq.connect.api.qzone.UserInfo;
import com.qq.connect.javabeans.AccessToken;
import com.qq.connect.javabeans.qzone.UserInfoBean;
import com.qq.connect.oauth.Oauth;

import zhuanli.dao.DatabaseAuthProvider;
import zhuanli.domain.Article;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.News;
import zhuanli.domain.Patent;
import zhuanli.domain.User;
import zhuanli.service.ArticleService;
import zhuanli.service.NewsService;
import zhuanli.service.PatentSearchService;
import zhuanli.service.PatentService;
import zhuanli.service.UserService;
import zhuanli.util.WeixinMessageDigest;



@Controller
public class IndexController {
	private PatentService patentService;
	private NewsService newsService;
	private ArticleService articleService;
	private PatentSearchService patentSearchService;
	private UserService userService;
	private DatabaseAuthProvider databaseAuthDao;
	
	@Autowired
	public IndexController(PatentService patentService,NewsService newsService,PatentSearchService patentSearchService,
						   ArticleService articleService,UserService userService,DatabaseAuthProvider databaseAuthDao) {
		this.patentService = patentService;
		this.newsService=newsService;
		this.articleService=articleService;
		this.patentSearchService=patentSearchService;
		this.userService=userService;
		this.databaseAuthDao=databaseAuthDao;
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
	
	@RequestMapping(value = "/afterQQLogin")
    public String afterQQLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=utf-8");
		String accessToken = null, openID = null;
        try {
	            AccessToken accessTokenObj = (new Oauth()).getAccessTokenByRequest(request);
	
	            @SuppressWarnings("unused")
				long tokenExpireIn = 0L;
	
	            if (accessTokenObj.getAccessToken().equals("")) {
	            	
	                System.out.print("没有获取到响应参数");
	            } else {
	                accessToken = accessTokenObj.getAccessToken();
	                tokenExpireIn = accessTokenObj.getExpireIn();
	                OpenID openIDObj = new OpenID(accessToken);
	                openID = openIDObj.getUserOpenID();
	                
	                UserInfo qzoneUserInfo = new UserInfo(accessToken, openID);
	                UserInfoBean userInfoBean = qzoneUserInfo.getUserInfo();
	                if (userInfoBean.getRet() == 0) {
	                	
	                	User qqUser = new User();
	                	System.out.println(userInfoBean.getNickname());
	                	System.out.println("<image src=" + userInfoBean.getAvatar().getAvatarURL30());
	                	System.out.println("<image src=" + userInfoBean.getAvatar().getAvatarURL50());
	                	System.out.println("<image src=" + userInfoBean.getAvatar().getAvatarURL100());
	                	
	                	qqUser.setUsername(openID);
	                	qqUser.setName(userInfoBean.getNickname());
	                	qqUser.setPassword(openID);
	                	qqUser.setVisiblePassword(openID);
	                	 userService.register(qqUser);
	             		User userInDB = (User) databaseAuthDao.loadUserByUsername(qqUser.getUsername());
	             		UsernamePasswordAuthenticationToken authenticationToken = 
	             					new UsernamePasswordAuthenticationToken(userInDB, qqUser.getPassword(), qqUser.getAuthorities());
	             		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
	                } else {
	                	System.out.println("很抱歉，我们没能正确获取到您的信息，原因是： " + userInfoBean.getMsg());
	                }
	            }
	        } catch (QQConnectException e) {
	        	e.printStackTrace();
	        }
        return "redirect:http://www.lotut.com";
    }
	
	
	
	
}
