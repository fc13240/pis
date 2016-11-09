package zhuanli.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qq.connect.QQConnectException;
import com.qq.connect.api.OpenID;
import com.qq.connect.api.qzone.PageFans;
import com.qq.connect.api.qzone.UserInfo;
import com.qq.connect.javabeans.AccessToken;
import com.qq.connect.javabeans.qzone.PageFansBean;
import com.qq.connect.javabeans.qzone.UserInfoBean;
import com.qq.connect.javabeans.weibo.Company;
import com.qq.connect.oauth.Oauth;

import zhuanli.controller.util.WebUtils;
import zhuanli.dao.DatabaseAuthProvider;
import zhuanli.domain.User;
import zhuanli.service.UserService;


@Controller
@RequestMapping(path="/user")
public class UserController {
	private UserService userService;
	private DatabaseAuthProvider databaseAuthDao;
	
    private Oauth qqOauth;
	
	@Autowired
	public UserController(UserService userService, DatabaseAuthProvider databaseAuthDao) {
		this.userService = userService;
		this.databaseAuthDao = databaseAuthDao;
	}	
	
	@RequestMapping(path="/registerForm", method=RequestMethod.GET)
	public String showRegisterForm() {
		return "register_form";
	}
	
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String register(User user,Model model,HttpSession session) {
		boolean success=userService.register(user);
		
		if(success){
			session.invalidate();
			return "register_success";
		}
		
		model.addAttribute("success", success);
		return "register_form";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public ModelAndView login(HttpSession httpSession) {
		return null;
	}
	
	@RequestMapping(path = "/logout")  
    public String logout(HttpSession httpSession){  
    	httpSession.invalidate();
    	SecurityContextHolder.clearContext();
        return "redirect:/index.html";
    }  	
	 
	public UserController() {
	}
   
	@RequestMapping(path = "/weChat",method = RequestMethod.GET)  
    public String weChat(HttpServletRequest request, HttpServletResponse response){
		User user =weChatReturnUserInfo(request,response);
		boolean success=userService.register(user);
		
		User userInDB = (User) databaseAuthDao.loadUserByUsername(user.getUsername());
		UsernamePasswordAuthenticationToken authenticationToken = 
					new UsernamePasswordAuthenticationToken(userInDB, user.getPassword(), user.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
		
        return "redirect:/index.html";
    }
	
	
	
	
	 public User weChatReturnUserInfo(HttpServletRequest request, HttpServletResponse response){
		 User user =new User();
		 try{

				String code = request.getParameter("code");
				//通过授权后根据code获取access_token、openid
				String url = String.format("https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code",
						WebUtils.APPID,WebUtils.APPSECRET,code);
				JSONObject tempValue = WebUtils.readJsonFromUrl(url);
				String openid = tempValue.getString("openid");
				String accessToken = tempValue.getString("access_token");
				int index = -1;
				if(openid != null && accessToken != null){
					String infoUrl = String.format("https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN", accessToken,openid);
					JSONObject userInfo = WebUtils.readJsonFromUrl(infoUrl);
					user.setUsername(userInfo.getString("unionid"));
					user.setName(userInfo.getString("nickname"));
					user.setPassword(userInfo.getString("unionid"));
					System.out.println(userInfo);
				}
	
		 }catch (Exception e){
			 e.printStackTrace();
		 }
	        return user;
	    }
	
	public static void main(String[] args) throws JSONException, IOException {
		String code = "021OPeMa0dLrnu13pcKa0TBiMa0OPeMc";
		//通过授权后根据code获取access_token、openid
		String url = String.format("https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code",
				WebUtils.APPID,WebUtils.APPSECRET,code);
		JSONObject tempValue = WebUtils.readJsonFromUrl(url);
		String openid = tempValue.getString("openid");
		String accessToken = tempValue.getString("access_token");
		int index = -1;
		if(openid != null && accessToken != null){
			String infoUrl = String.format("https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN", accessToken,openid);
			JSONObject userInfo = WebUtils.readJsonFromUrl(infoUrl);
			System.out.println(userInfo);
		}
	}
	
	@RequestMapping(path = "/user_forget_password", method=RequestMethod.GET)  
    public String userForgetPassword(HttpSession httpSession){  
        return "user_forget_password";
    }
	
	@RequestMapping(path = "/user_find_password_form",method = RequestMethod.POST)  
    public void userFindPasswordForm(HttpServletResponse response,PrintWriter out,@RequestParam String username,@RequestParam String email) throws IOException{  
    	User user = userService.findByName(username);
    	String processStatus="";
    	if (user == null) {
    		processStatus="2";
    	}else{
    		if(email.equals(user.getEmail())){
    			processStatus=userService.findPassword(user);
        	}else{
        		processStatus="4";
        	}
    			
    	}
    	out.write(processStatus);
    }
	
	@RequestMapping(path = "/userLogin",method = RequestMethod.POST)  
    public void userLogin(String username,String password,PrintWriter out) {  
    	User user = userService.findByName(username);
    	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    	User userInDB = null;
    	if (user != null) {
    		if(encoder.matches(password, user.getPassword())) {
        		userInDB = (User) databaseAuthDao.loadUserByUsername(user.getUsername());
        		UsernamePasswordAuthenticationToken authenticationToken = 
        					new UsernamePasswordAuthenticationToken(userInDB, user.getPassword(), user.getAuthorities());
        		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        	}
    	}
    	out.write(userInDB.getUserId());
    }
	
	
	@RequestMapping(path="/saveQQUser")
	public void saveQQUser(String openId,String nickname){
		 User user =new User();
		 user.setUsername(openId);
		 
		 if(StringUtils.isEmpty(nickname)){
			 user.setName(openId);
		 }else {
			 user.setName(nickname);
		}
		 userService.register(user);
		User userInDB = (User) databaseAuthDao.loadUserByUsername(user.getUsername());
		UsernamePasswordAuthenticationToken authenticationToken = 
					new UsernamePasswordAuthenticationToken(userInDB, user.getPassword(), user.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
	}
	
	
	@RequestMapping(path="/QQLogin")
	public void QQLoginForm(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		try {
			response.sendRedirect(qqOauth.getAuthorizeURL(request));
		} catch (QQConnectException e) {
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/afterQQLogin")
    protected void afterQQLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        try {
            AccessToken accessTokenObj = (new Oauth()).getAccessTokenByRequest(request);

            String accessToken = null, openID = null;
            long tokenExpireIn = 0L;

            if (accessTokenObj.getAccessToken().equals("")) {
//                我们的网站被CSRF攻击了或者用户取消了授权
//                做一些数据统计工作
                System.out.print("没有获取到响应参数");
            } else {
                accessToken = accessTokenObj.getAccessToken();
                tokenExpireIn = accessTokenObj.getExpireIn();

                // 利用获取到的accessToken 去获取当前用的openid -------- start
                OpenID openIDObj = new OpenID(accessToken);
                openID = openIDObj.getUserOpenID();
                out.println("欢迎你，代号为 " + openID + " 的用户!");
                // 利用获取到的accessToken 去获取当前用户的openid --------- end

                out.println("<p> start -----------------------------------利用获取到的accessToken,openid 去获取用户在Qzone的昵称等信息 ---------------------------- start </p>");
                UserInfo qzoneUserInfo = new UserInfo(accessToken, openID);
                UserInfoBean userInfoBean = qzoneUserInfo.getUserInfo();
                out.println("<br/>");
                if (userInfoBean.getRet() == 0) {
                    out.println(userInfoBean.getNickname() + "<br/>");
                    out.println(userInfoBean.getGender() + "<br/>");
                    out.println("黄钻等级： " + userInfoBean.getLevel() + "<br/>");
                    out.println("会员 : " + userInfoBean.isVip() + "<br/>");
                    out.println("黄钻会员： " + userInfoBean.isYellowYearVip() + "<br/>");
                    out.println("<image src=" + userInfoBean.getAvatar().getAvatarURL30() + "/><br/>");
                    out.println("<image src=" + userInfoBean.getAvatar().getAvatarURL50() + "/><br/>");
                    out.println("<image src=" + userInfoBean.getAvatar().getAvatarURL100() + "/><br/>");
                } else {
                    out.println("很抱歉，我们没能正确获取到您的信息，原因是： " + userInfoBean.getMsg());
                }
                out.println("<p> end -----------------------------------利用获取到的accessToken,openid 去获取用户在Qzone的昵称等信息 ---------------------------- end </p>");


                out.println("<p> start ----------------------------------- 验证当前用户是否为认证空间的粉丝------------------------------------------------ start <p>");
                PageFans pageFansObj = new PageFans(accessToken, openID);
                PageFansBean pageFansBean = pageFansObj.checkPageFans("97700000");
                if (pageFansBean.getRet() == 0) {
                    out.println("<p>验证您" + (pageFansBean.isFans() ? "是" : "不是") + "QQ空间97700000官方认证空间的粉丝</p>");
                } else {
                    out.println("很抱歉，我们没能正确获取到您的信息，原因是： " + pageFansBean.getMsg());
                }
                out.println("<p> end ----------------------------------- 验证当前用户是否为认证空间的粉丝------------------------------------------------ end <p>");

                out.println("<p> start -----------------------------------利用获取到的accessToken,openid 去获取用户在微博的昵称等信息 ---------------------------- start </p>");
                
            }
        } catch (QQConnectException e) {
        }
    }
}



