package ideaStreet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ideaStreet.domain.MobilePatent;
import ideaStreet.domain.Page;
import ideaStreet.service.PatentMobileService;

@Controller
@RequestMapping(path="/mobilePatent")
public class MobilePatentController {
	private PatentMobileService patentMobileService;
	
	@Autowired
	public MobilePatentController(PatentMobileService patentMobileService) {
		this.patentMobileService = patentMobileService;
	}
/*
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String index(Page page,Model model) {
		page.setPageSize(5);
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		List<MobilePatent> patents = patentMobileService.getUserPatents(page);
		model.addAttribute("patents", patents);
		return "mobile_patent_list";
	}
	*/
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String getUserPatents(Page page,Model model) {
		page.setPageSize(50);
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		List<MobilePatent> patents = patentMobileService.getUserPatents(page);
		model.addAttribute("patents", patents);
		return "mobile_patent_list";
	}
	
	@RequestMapping(path="patentPreview")
	public String patentPreview(long patentId,Model model) {
		MobilePatent mobilePatent=patentMobileService.getPatentById(patentId);
		model.addAttribute("mobilePatent", mobilePatent);
		return "mobile_patent_preview";
	}
	
	
	
}
