package ideaStreet.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ideaStreet.domain.Page;
import ideaStreet.domain.Patent;
import ideaStreet.service.PatentService;
import ideaStreet.util.WebUtils;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;




@RequestMapping(path="/business")
@Controller
public class BusinessController {
	private PatentService patentService;
	@Autowired
	public BusinessController(PatentService patentService) {
		this.patentService = patentService;
	}

//商标  shangbiao
	@RequestMapping(path="/trademark_registration", method=RequestMethod.GET)
	public String trademarkRegistration(Model model,int type) {
		if(type==1){
			return "service_trademark_registration1";
		}else if(type==2){
			return "service_trademark_registration2";
		}else if(type==3){
			return "service_trademark_registration3";
		}else if(type==4){
			return "service_trademark_registration4";
		}
		return "";
	}
	@RequestMapping(path="/trademark_list")
	public String trademarkList(Model model) {

			return "service_trademark_list";

	}	
	//ban quan
	@RequestMapping(path="/copyright_registration", method=RequestMethod.GET)
	public String copyrightRegistration(Model model,int type) {
		if(type==1){
			return "service_copyright_registration1";
		}else if(type==2){
			return "service_copyright_registration2";
		}
		return "";
		
	}
	@RequestMapping(path="/copyright_list")
	public String copyrightList(Model model) {

			return "service_copyright_list";

	}
	//工商 gongshang
	@RequestMapping(path="/business_registration")
	public String businessRegistration(Model model) {
//		if(type==1){
//			return "service_business_registration1";
//		}else if(type==2){
//			return "service_business_registration2";
//		}
		return "service_business_registration";		
	}	
	//patent zhuce
	@RequestMapping(path="/patent_registration", method=RequestMethod.GET)
	public String patentRegistration(Model model,int type) {
		if(type==1){
			return "service_patent_registration1";
		}else if(type==2){
			return "service_patent_registration2";
		}else if(type==3){
			return "service_patent_registration3";
		}
		return "";			

	}
	@RequestMapping(path="/patent_list")
	public String patentList(Model model) {

			return "service_patent_list";

	}	
	@RequestMapping(path="/patent_article", method=RequestMethod.GET)
	public String patentArticle(Model model,int shopType,Page page, HttpSession session) {
		page.setPageSize(WebUtils.getPageSize(session));
		if(page.getCurrentPage()<1){
			page.setCurrentPage(1);
		}
		int totalCount=(int)patentService.getPatentsByShopTypeCount(shopType);
		page.setTotalRecords(totalCount);
		List<Patent> patents = patentService.getPatentsByShopType(shopType,page); 
		model.addAttribute("patents", patents);
		model.addAttribute("page", page);
		model.addAttribute("shopType", shopType);
		return "service_patent_article";
		

	}		
}
