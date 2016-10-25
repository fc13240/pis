package zhuanli.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import net.lingala.zip4j.core.ZipFile;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.Notice;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.SecondColumn;
import zhuanli.service.PatentService;


@RequestMapping(path="/patent")
@Controller
public class PatentController {
	private PatentService patentService;

	@Autowired
	public PatentController(PatentService patentService) {
		this.patentService = patentService;
	}

	@RequestMapping(path="/list",method=RequestMethod.GET)
	public String getPatents(Page page, Model model) {
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		int patent_column_id= page.getId();
		List<FirstColumn>  AllColumns=patentService.selectAllColumns();
		List<Patent> patent_list=patentService.getSecoundColumnPage(page);
		
		model.addAttribute("AllColumns", AllColumns);
		model.addAttribute("first_column_id", patent_column_id);
		model.addAttribute("patents", patent_list);
		model.addAttribute("page",page);
		return "patent_list";
	}

	@RequestMapping(path="/sublist",method=RequestMethod.GET)
	public String getPatentSecound(Page page, Model model) {
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		int patent_second_column_id=page.getId();
		List<FirstColumn>  AllColumns=patentService.selectAllColumns();
		
		List<Patent> patents = patentService.getSecoundPatentPage(page);
		String currentTypeName=patentService.getCurrentTypeName(patent_second_column_id);
		int	  first_column_id=patentService.getFirstId(patent_second_column_id);
		
		model.addAttribute("AllColumns", AllColumns);
		model.addAttribute("first_column_id", first_column_id);		
		model.addAttribute("patents", patents);
		model.addAttribute("currentTypeName", currentTypeName);
		model.addAttribute("page",page);
		return "patent_list";
	}		
	


	@RequestMapping(path="/search",method=RequestMethod.GET)
	public String searchPatents(@ModelAttribute("patentSearchCondition") PatentSearchCondition patentSearchCondition , Model model) {
		Page page = patentSearchCondition.getPage();
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		List<FirstColumn>  AllColumns=patentService.selectAllColumns();
		List<Patent> patents=patentService.searchPatents(patentSearchCondition);
		int totalCount=(int)patentService.searchPatentsCount(patentSearchCondition);
		page.setTotalRecords(totalCount);
		model.addAttribute("AllColumns", AllColumns);
		model.addAttribute("page",page);
		model.addAttribute("patents", patents);
		return "patent_search_list";
	}	
	
	@RequestMapping(path="/detail",method=RequestMethod.GET)
	public String getPatentsDetail(@RequestParam("patentno") long patent_id , Model model) {

		Patent patent=patentService.getPatentById(patent_id);
		

		List<Notice> notices=patentService.getNoticeByPatentno(patent_id);
		
		model.addAttribute("notices", notices);
		model.addAttribute("patent", patent);
		
		return "patent_detail";
	}

	@RequestMapping(path="/download", method=RequestMethod.GET)
	public void downloadNotice(@RequestParam("notice")int noticeId, HttpServletResponse response,HttpServletRequest request) throws IOException {
		response.setContentType("application/zip");
		
		Notice notice = patentService.getNoticeById(noticeId);
		ZipFile noticeZipFile = patentService.createNoticeZipFile(notice);
		String dispatchDate = new SimpleDateFormat("yyyy-MM-dd").format(notice.getDispatchDate());
		String downloadFileName = dispatchDate + URLEncoder.encode(notice.getName(), "UTF8") + 
				notice.getPatent().getApp_no() + URLEncoder.encode(notice.getPatent().getPatent_name(), "UTF8");
		
		
		if("FF".equals(getBrowser(request))){
			downloadFileName =dispatchDate+ new String(notice.getName().getBytes("UTF-8"),"iso-8859-1")+
					notice.getPatent().getApp_no()+new String(notice.getPatent().getPatent_name().getBytes("UTF-8"),"iso-8859-1");
		}
		response.setHeader("Content-Disposition", "attachment;filename=" + downloadFileName + ".zip");
		response.setContentLength((int)noticeZipFile.getFile().length());
		int BUFFER_SIZE = 8192;
		byte[] buffer = new byte[BUFFER_SIZE];
		try (OutputStream out = response.getOutputStream(); 
				FileInputStream fis = new FileInputStream(noticeZipFile.getFile())) {
			int bytesRead = -1;
			while ((bytesRead = fis.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}
			out.flush();
		}
	}
	
	private String getBrowser(HttpServletRequest request){
	    String UserAgent = request.getHeader("USER-AGENT").toLowerCase();
	    if(UserAgent!=null){
	        if (UserAgent.indexOf("msie") >=0 ) return "IE";
	        if (UserAgent.indexOf("firefox") >= 0) return "FF";
	    }
	    return null;
	}
	
	@RequestMapping(path="/exportPatents", method=RequestMethod.GET)
	public void exportFeesAllMessage(HttpServletResponse response) throws IOException {
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("X-FRAME-OPTIONS", "SAMEORIGIN");

		
		String exportExcelName = System.currentTimeMillis() + ".xls";
		String exportExcelPath = patentService.PatentExportExcel(exportExcelName);
		File excelFile = new File(exportExcelPath);
		response.setContentLength((int)excelFile.length());
		response.setHeader("Content-Disposition", "attachment;filename=" + exportExcelName);
		
		int BUFFER_SIZE = 8192;
		byte[] buffer = new byte[BUFFER_SIZE];
		try (OutputStream out = response.getOutputStream(); 
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(excelFile))) {
			int bytesRead = -1;
			while ((bytesRead = bis.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}
			out.flush();
		}
	}	
	
	
	
}
