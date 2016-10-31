package zhuanli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationController {
	@RequestMapping("/loginForm")
	public String showLoginForm() {
		return "login_form";
	}
}
