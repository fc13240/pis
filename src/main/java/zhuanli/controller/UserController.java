package zhuanli.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import zhuanli.controller.util.WebUtils;
import zhuanli.domain.User;
import zhuanli.service.UserService;
import zhuanli.util.PrincipalUtils;


@Controller
@RequestMapping(path="/user")
public class UserController {
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
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
	
    @RequestMapping(path = "/logout",method = RequestMethod.POST)  
    public String logout(HttpSession httpSession){  
    	httpSession.invalidate();
        return "login_form";
    }  	
	 
	public UserController() {
	}
   
	@RequestMapping(path = "/weChat",method = RequestMethod.GET)  
    public String weChat(HttpServletRequest request, HttpServletResponse response){
		User user =weChatReturnUserInfo(request,response);
		boolean success=userService.register(user);
		if(success){
			
		}else{
			
		}
        return "";
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
					user.setPassword(WebUtils.roundPassword(5));
					System.out.println(userInfo);
				}
	
		 }catch (Exception e){
			 e.printStackTrace();
		 }
	        return user;
	    }
	
	
	
	
	
	public static void main(String[] args) throws JSONException, IOException {
		String code = "021IYH792x0qeP0Qkf692idC792IYH7Y";
		//通过授权后根据code获取access_token、openid
		String url = String.format("https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code",
				WebUtils.APPID,WebUtils.APPSECRET,code);
		JSONObject tempValue = WebUtils.readJsonFromUrl(url);
		System.out.println(tempValue.toString());
		String openid = tempValue.getString("openid");
		System.out.println(openid);
		String accessToken = tempValue.getString("access_token");
		int index = -1;
		if(openid != null && accessToken != null){
			String infoUrl = String.format("https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN", accessToken,openid);
			JSONObject userInfo = WebUtils.readJsonFromUrl(infoUrl);
			System.out.println(userInfo);
		}
	}
}
