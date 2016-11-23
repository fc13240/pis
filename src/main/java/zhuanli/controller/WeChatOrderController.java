package zhuanli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zhuanli.domain.WeChatOrder;
import zhuanli.service.WeChatOrderService;

@Controller
@RequestMapping(path="/wxOrder")
public class WeChatOrderController {
	private WeChatOrderService weChatOrderService;

	@Autowired
	public WeChatOrderController(WeChatOrderService weChatOrderService) {
		this.weChatOrderService = weChatOrderService;
	}
	
	@RequestMapping(path="/registerForm", method=RequestMethod.GET)
	public void showRegisterForm(WeChatOrder weChatOrder) {
		weChatOrderService.saveWeChatOrder( weChatOrder);
	}
	
}
