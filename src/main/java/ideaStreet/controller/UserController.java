package ideaStreet.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
import com.qq.connect.oauth.Oauth;

import ideaStreet.controller.util.WebUtils;
import ideaStreet.dao.DatabaseAuthProvider;
import ideaStreet.domain.User;
import ideaStreet.service.UserService;


@Controller
@RequestMapping(path="/user")
public class UserController {
	private UserService userService;
	private DatabaseAuthProvider databaseAuthDao;
	
    //private Oauth qqOauth;
	
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
        return "redirect:http://www.lotut.com";
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
		String code = "031U3AYd0g3TOx1TvFYd0AjBYd0U3AYF";
		//通过授权后根据code获取access_token、openid
		String url = String.format("https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code",
				WebUtils.APPID,WebUtils.APPSECRET,code);
		JSONObject tempValue = WebUtils.readJsonFromUrl(url);
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
    public void userLogin(String username,String password,PrintWriter out) throws Exception { 
		if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
			throw new Exception("用户名或者密码为空!");
		}
    	User user = userService.findByName(username);
    	if(user == null) {
    		throw new Exception("用户不存在!");
    	} 
		User userInDB = null;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(encoder.matches(password, user.getPassword())) {
    		userInDB = (User) databaseAuthDao.loadUserByUsername(user.getUsername());
    		UsernamePasswordAuthenticationToken authenticationToken = 
    					new UsernamePasswordAuthenticationToken(userInDB, user.getPassword(), user.getAuthorities());
    		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    		out.write(1);
    	} else {
    		throw new Exception("密码不正确!");
    	}    	
    }
	
	@RequestMapping(path="/QQLogin")
	public void QQLoginForm(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		try {
			response.sendRedirect(new Oauth().getAuthorizeURL(request));
		} catch (QQConnectException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(path="/testShare")
	public String testShare() {
		return "test_share";
	}

}



