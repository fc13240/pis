package ideaStreet.controller.weChatPay;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ideaStreet.controller.weChatPayUtil.SystemConfig;


@Controller
@RequestMapping("/wx")
public class WeChatIndexController {

	@RequestMapping("/lotutPay")
	public String xfPay(Model model){
		
		String rateStr = SystemConfig.getRateKey();
		Double rate = 1.0;
		if(StringUtils.isNotBlank(rateStr)){
			rate = 1.0 + new Double(rateStr);
		}
		
		model.addAttribute("rate", rate);
		
		return "lotutpay";
	}
}
