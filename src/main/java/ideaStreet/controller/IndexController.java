package ideaStreet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

import ideaStreet.dao.DatabaseAuthProvider;
import ideaStreet.domain.Article;
import ideaStreet.domain.FirstColumn;
import ideaStreet.domain.News;
import ideaStreet.domain.Patent;
import ideaStreet.domain.User;
import ideaStreet.service.ArticleService;
import ideaStreet.service.NewsService;
import ideaStreet.service.PatentSearchService;
import ideaStreet.service.PatentService;
import ideaStreet.service.UserService;
import ideaStreet.util.WeixinMessageDigest;



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

		List<News> hotNews=newsService.getHomepageByType(1,5);
		List<News> technologyNews=newsService.getHomepageByType(2,8);
		List<News> cartoonNews=newsService.getHomepageByType(3,2);
		List<News> laughNews=newsService.getHomepageByType(4,2);
		List<News> creativeLifeNews=newsService.getHomepageByType(5,10);
		List<News> creativePrductNews=newsService.getHomepageByType(6,10);
		List<News> creativeDesignNews=newsService.getHomepageByType(7,10);
		
		List<News> businessSay=newsService.getHomepageByType(8,10);
		List<News> businessNews=newsService.getHomepageByType(9,10);
		List<News> businessPolicy=newsService.getHomepageByType(10,10);
		
		List<News> patentNews=newsService.getHomepageByType(11,4);
		List<News> patentStudy=newsService.getHomepageByType(12,5);
		List<News> brandNews=newsService.getHomepageByType(13,10);
		List<News> brandStudy=newsService.getHomepageByType(14,5);	
		
		//获取多个类型的方法
		/*List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		List<News> newss=newsService.getNewsByTypeList(list);*/
		
		model.addAttribute("hotNews", hotNews);
		model.addAttribute("technologyNews", technologyNews);
		model.addAttribute("cartoonNews", cartoonNews);
		model.addAttribute("laughNews", laughNews);
		
		model.addAttribute("creativeLifeNews", creativeLifeNews);
		model.addAttribute("creativePrductNews", creativePrductNews);
		model.addAttribute("creativeDesignNews", creativeDesignNews);
		
		model.addAttribute("businessSay", businessSay);
		model.addAttribute("businessNews", businessNews);
		model.addAttribute("businessPolicy", businessPolicy);
		
		model.addAttribute("patentNews", patentNews);
		model.addAttribute("patentStudy", patentStudy);
		model.addAttribute("brandNews", brandNews);
		model.addAttribute("brandStudy", brandStudy);		
		
		return "index";
	}
		
	@RequestMapping(path="/token")
	public void weiXin(HttpServletRequest req, HttpServletResponse resp){
		PrintWriter pw = null;
		try{
			 pw = resp.getWriter();
			System.out.println("璇锋眰鍒版潵");
		       resp.setCharacterEncoding("GBK");
		       // 寰俊鍔犲瘑绛惧悕 
		        String signature = req.getParameter("signature"); 
		        System.out.println(signature);
		        // 鏃堕棿鎴� 
		        String timestamp = req.getParameter("timestamp");
		        System.out.println(timestamp);
		        // 闅忔満鏁� 
		        String nonce = req.getParameter("nonce"); 
		        System.out.println(nonce);
		        // 闅忔満瀛楃涓�  
		        String echostr = req.getParameter("echostr");
		        WeixinMessageDigest wxDigest = WeixinMessageDigest.getInstance();  
		        boolean bValid = wxDigest.validate(signature, timestamp, nonce);
		       
		        if(bValid){
		 	        pw.write(echostr);  //杩欓噷 echostr 鐨勫�煎繀椤昏繑鍥烇紝鍚﹀垯寰俊璁や负璇锋眰澶辫触
		        }else{
		        	 pw.write("token 楠岃瘉澶辫触!");
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
	            	
	                System.out.print("娌℃湁鑾峰彇鍒板搷搴斿弬鏁�");
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
	                	System.out.println("寰堟姳姝夛紝鎴戜滑娌¤兘姝ｇ‘鑾峰彇鍒版偍鐨勪俊鎭紝鍘熷洜鏄細 " + userInfoBean.getMsg());
	                }
	            }
	        } catch (QQConnectException e) {
	        	e.printStackTrace();
	        }
        return "redirect:http://www.lotut.com";
    }
	
	
	
	
}
