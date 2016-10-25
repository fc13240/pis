package zhuanli.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import zhuanli.domain.ColumnCount;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.service.PatentService;



@Controller
public class IndexController {
	private PatentService patentService;

	@Autowired
	public IndexController(PatentService patentService) {
		this.patentService = patentService;
	}
	@RequestMapping(path="/index")
	public String getPatents(Model model) {

		List<FirstColumn>  AllColumns=patentService.selectAllColumns();

		//List<Patent> patent_list1=patentService.getSecoundColumn(1);
		//List<Patent> patent_list2=patentService.getSecoundColumn(2);
		//List<Patent> patent_list3=patentService.getSecoundColumn(3);
		//List<Patent> patent_list4=patentService.getSecoundColumn(4);
		//List<Patent> patent_list5=patentService.getSecoundColumn(5);
		//List<Patent> patent_list6=patentService.getSecoundColumn(6);
		//List<Patent> patent_list7=patentService.getSecoundColumn(7);
		//List<Patent> patent_list8=patentService.getSecoundColumn(8);
		//List<Patent> patent_list9=patentService.getSecoundColumn(9);
		//List<Patent> patent_list10=patentService.getSecoundColumn(10);
		//List<Patent> patent_list11=patentService.getSecoundColumn(11);
		
		List<Patent> patent_list=patentService.getPatents();
		model.addAttribute("patent_list", patent_list);
	
		model.addAttribute("AllColumns", AllColumns);
		return "index";
	}


}
