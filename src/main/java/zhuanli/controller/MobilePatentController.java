package zhuanli.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentRemark;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.PatentStatus;
import zhuanli.domain.PatentType;
import zhuanli.service.PatentMobileService;
import zhuanli.util.PrincipalUtils;
import zhuanli.util.WebUtils;

@Controller
@RequestMapping(path="/mobilePatent")
public class MobilePatentController {
	private PatentMobileService patentMobileService;
	//private FriendService friendService;
	
	@Autowired
	public MobilePatentController(PatentMobileService patentMobileService) {
	//public PatentMobileController(PatentMobileService patentMobileService, FriendService friendService) {
		this.patentMobileService = patentMobileService;
		//this.friendService = friendService;
	}

	@RequestMapping(path="/list", method=RequestMethod.GET)
	public String getUserPatents(Model model, Page page, HttpSession session) {
		int userId = PrincipalUtils.getCurrentUserId();
		page.setUserId(userId);
		page.setPageSize(WebUtils.getPageSize(session));
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		//分页相关
		int totalCount=(int)patentMobileService.getPatentsCount(userId);
		page.setTotalRecords(totalCount);
		Map<String, Map<String, String>> patentTypeCount=patentMobileService.getUserPatentCountByType(userId);
		Map<String, Map<String, String>> patentStatusCount=patentMobileService.searchUserPatentsByPatentStatus(userId);
		List<Patent> patents = patentMobileService.getUserPatents(page);
		model.addAttribute("patents", patents);
		model.addAttribute("page", page);
		model.addAttribute("patentTypeCount", patentTypeCount);
		model.addAttribute("patentStatusCount", patentStatusCount);
		
		
		addPatentTypeAndStatusDataToModel(model);
		return "patent_list";
	}
	
	@RequestMapping(path="list", method=RequestMethod.GET, params="patentType")
	public String getPatentsByType(@RequestParam("patentType") int patentType, Model model) {
		int userId = PrincipalUtils.getCurrentUserId();
		List<Patent> patents = patentMobileService.getUserPatentsByType(userId, patentType);
		model.addAttribute("patents", patents);
        addPatentTypeAndStatusDataToModel(model);
		return "patent_list";
	}
	
	@RequestMapping(path="list", method=RequestMethod.GET, params="patentStatus")
	public String getPatentsByStatus(@RequestParam("patentStatus") int patentStatus, Model model) {
		int userId = PrincipalUtils.getCurrentUserId();
		List<Patent> patents = patentMobileService.getUserPatentsByStatus(userId, patentStatus);
		model.addAttribute("patents", patents);
		addPatentTypeAndStatusDataToModel(model);
		return "patent_list";
	}	
	
	@RequestMapping(path="list", method=RequestMethod.GET, params="user")
	public String getShareUserPatents(@RequestParam("user") int userId, Model model) {
		return null;
	}	
	
	//显示好友
	/*@RequestMapping(path="showFriends", method=RequestMethod.GET)
	public String showFriends(Model model) {
		int userId = PrincipalUtils.getCurrentUserId();
		List<User> friends = friendService.getUserFriends(userId);
		model.addAttribute("friends", friends);
		return "patent_select_friends";
	}*/
	
	
	//搜索好友
	/*@RequestMapping(path="searchFriends", method=RequestMethod.GET)
	public String searchFriends(@RequestParam("keyword")String keyword, Model model) {
		int userId = PrincipalUtils.getCurrentUserId();
		List<User> friends = friendService.searchUserFriends(userId, keyword);
		model.addAttribute("friends", friends);
		return "patent_select_friends";
	}	*/
	
	@RequestMapping(path="/detail/{patentId:\\d+}", method=RequestMethod.GET)
	public String showDetail(@PathVariable long patentId, Model model) {
		Patent patent = patentMobileService.getPatentDetail(patentId);
		model.addAttribute("patent", patent);
		return "patent_detail";
	}	
	
	
	@RequestMapping(path="/changeInternalCode", method=RequestMethod.GET)
	public String changeInternalCode(@RequestParam("patentId")int patentId, @RequestParam("internalCode")String internalCode) {
		patentMobileService.changeInternalCode(patentId, internalCode);
		return "patent_list";
	}
	
	@RequestMapping(path="/search", method=RequestMethod.GET)
	public String searchUserPatents(@ModelAttribute("searchCondition")PatentSearchCondition searchCondition, Model model,HttpSession session) {
		Page page=searchCondition.getPage();
		page.setPageSize(WebUtils.getPageSize(session));
		searchCondition.setUserId(PrincipalUtils.getCurrentUserId());
		List<Patent> resultPatents = patentMobileService.searchUserPatentsWithPage(searchCondition);
		int totalCount=(int)patentMobileService.searchUserPatentsCount(searchCondition);
		page.setTotalRecords(totalCount);
		Map<String, Map<String, String>> patentTypeCount=patentMobileService.getUserPatentCountByType(searchCondition.getUserId());
		Map<String, Map<String, String>> patentStatusCount=patentMobileService.searchUserPatentsByPatentStatus(searchCondition.getUserId());
		model.addAttribute("patents", resultPatents);
		model.addAttribute("page", page);
		model.addAttribute("patentTypeCount",patentTypeCount);
		model.addAttribute("patentStatusCount",patentStatusCount);
		addPatentTypeAndStatusDataToModel(model);
		return "patent_list";
	}
	
	@RequestMapping(path="/showUploadForm", method=RequestMethod.GET)
	public String showUploadForm() {
		return "patent_upload_form";
	}	
	
	/*@RequestMapping(path="/upload", method=RequestMethod.POST)
	public String uploadPatents(@RequestParam("patentFile")Part patentFile, Model model) {
		try {
			if (!patentFile.getSubmittedFileName().endsWith(".xls") && !patentFile.getSubmittedFileName().endsWith(".xlsx")) {
				throw new RuntimeException("上传的文件不是excel表格");
			}
			InputStream is = patentFile.getInputStream();
			int userId = PrincipalUtils.getCurrentUserId();
			patentMobileService.uploadPatents(is,userId);
			return "upload_success";
		} catch (Exception e) {
			model.addAttribute("message", "上传失败，请检查文件格式稍后再试！");
			return "common_message";
		}
	}	*/
	
	
	//商品交易
	/*@RequestMapping(path="/goods", method=RequestMethod.GET)
	public String showGoodsForm(@RequestParam("patent") int patent_id,Model model) throws IOException {
		
		List<GoodsFirstColumn>  FirstColumns=patentMobileService.getFirstColumn();
		
		Patent patent = patentMobileService.getPatentDetail(patent_id);
		model.addAttribute("patent", patent);		
		
		model.addAttribute("patentId", patent_id);
		model.addAttribute("FirstColumns", FirstColumns);
		return "goods_form";
	}*/
	
	//商品交易
	/*@RequestMapping(path="/addGoods", method=RequestMethod.POST)
	public String addGoods(@Valid GoodsDetail goodDetail, Model model) throws IOException {
		goodDetail.setUserId(PrincipalUtils.getCurrentUserId());
		patentMobileService.saveGoods(goodDetail);
		return "goods_add_success";
	}		*/
		
	/*@RequestMapping(path="/getGoodsSecoundColumn", method=RequestMethod.GET)
	public void getGoodsSecoundColumn(@RequestParam("first_column")int firstColumnId, 
			Model model, HttpServletResponse response) throws IOException {

		response.setContentType("application/json;charset=UTF-8");
		List<GoodsSecondColumn>  SecondColumns=patentMobileService.getSecondColumn(firstColumnId);
		WebUtils.writeJsonStrToResponse(response, SecondColumns);
	}*/
	
	
	
	
	private void addPatentTypeAndStatusDataToModel(Model model) {
		List<PatentType> allPatentTypes = patentMobileService.getAllPatentTypes();
		List<PatentStatus> allPatentStatus = patentMobileService.getAllPatentStatus();
		model.addAttribute("allPatentTypes", allPatentTypes);
		model.addAttribute("allPatentStatus", allPatentStatus);
	}
	
	//添加专利
	@RequestMapping(path="/addPatentFrom", method=RequestMethod.GET)
	public String addPatentFrom(Model model){
		addPatentTypeAndStatusDataToModel(model);
		return "addPatentFrom";
	}
	
	
	
	/*@RequestMapping(path="/addPatent", method=RequestMethod.POST)
	public String addPatent(@ModelAttribute("patent")Patent patent,Model model){
		int userId = PrincipalUtils.getCurrentUserId();
		patent.setOwnerId(userId);
		patentMobileService.addPatent(patent);
		return "add_patent_success";
	}*/
	
	
	//导出专利excel表格
	/*@RequestMapping(path="/exportPatents",method=RequestMethod.GET)
	public void exportPatents(@RequestParam("patentIds") List<Long> patentIds,HttpServletResponse response) throws IOException{
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("X-FRAME-OPTIONS", "SAMEORIGIN");

		User user = PrincipalUtils.getCurrentPrincipal();
		String exportExcelName = user.getUsername() + System.currentTimeMillis() + ".xls";
		String exportExcelPath = patentMobileService.patentExportExcel(patentIds, exportExcelName);
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
	}*/
	
	
	/*@RequestMapping(path="/getUserTransactionPatents", method=RequestMethod.GET)
	public String getUserTransactionPatents(Model model, Page page, HttpSession session) {
		int userId = PrincipalUtils.getCurrentUserId();
		page.setUserId(userId);
		page.setPageSize(WebUtils.getPageSize(session));
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		int totalCount=(int)patentMobileService.getUserTransactionPatentsCount(userId);
		page.setTotalRecords(totalCount);
		List<GoodsDetail> patents = patentMobileService.getUserTransactionPatents(page);
		List<GoodsFirstColumn>  FirstColumns=patentMobileService.getFirstColumn();
		model.addAttribute("FirstColumns", FirstColumns);
		model.addAttribute("patents", patents);
		model.addAttribute("page", page);
		return "goods_list";
	}*/
	
	/*@RequestMapping(path="/searchTransactionPatents", method=RequestMethod.GET)
	public String searchTransactionPatents(@ModelAttribute("searchCondition")TransactionPatentSearchCondition searchCondition, Model model,HttpSession session) {
		Page page=searchCondition.getPage();
		page.setPageSize(WebUtils.getPageSize(session));
		searchCondition.setUserId(PrincipalUtils.getCurrentUserId());
		List<GoodsDetail> resultPatents = patentMobileService.searchTransactionPatentsByPage(searchCondition);
		int totalCount=(int)patentMobileService.searchTransactionPatentsCount(searchCondition);
		page.setTotalRecords(totalCount);
		List<GoodsFirstColumn>  FirstColumns=patentMobileService.getFirstColumn();
		model.addAttribute("FirstColumns", FirstColumns);
		model.addAttribute("patents", resultPatents);
		model.addAttribute("page", page);
		return "goods_list";
	}*/

	@RequestMapping(path="/downTransactionPatent")
	public void downTransactionPatents(@RequestParam("patentId") int patentId,PrintWriter writer){
		patentMobileService.downTransactionPatent(patentId);
		writer.write(1);
	}	
	@RequestMapping(path="/upTransactionPatent")
	public void upTransactionPatents(@RequestParam("patentId") int patentId,PrintWriter writer){
		patentMobileService.upTransactionPatent(patentId);
		writer.write(1);
	}	
	@RequestMapping(path="/deleteTransactionPatent")
	public void deleteTransactionPatents(@RequestParam("patentId") int patentId,PrintWriter writer){
		patentMobileService.deleteTransactionPatent(patentId);
		writer.write(1);
	}
	
	@RequestMapping(path="/deletePatents", method=RequestMethod.GET)
	public void deletePatents(@RequestParam("patentIds") List<Long> patentIds,PrintWriter writer){
		int userId = PrincipalUtils.getCurrentUserId();
		patentMobileService.patentsTrash(patentIds,userId);
		writer.write(1);
	}
	
	@RequestMapping(path="/patentRecycled", method=RequestMethod.GET)
	public String patentRecycled(Model model, Page page, HttpSession session){
		int userId = PrincipalUtils.getCurrentUserId();
		page.setUserId(userId);
		page.setPageSize(WebUtils.getPageSize(session));
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		int totalCount=patentMobileService.getPatentsRecycledCount(userId);
		page.setTotalRecords(totalCount);
		List<Patent> patents=patentMobileService.getPatentsRecycled(page);
		model.addAttribute("patents", patents);
		model.addAttribute("page", page);
		return "patent_recycled";
	}
	@RequestMapping(path="/recoverPatents", method=RequestMethod.GET)
	public void recoverPatent(@RequestParam("patentIds") List<Long> patentIds,PrintWriter writer){
		int userId = PrincipalUtils.getCurrentUserId();
		patentMobileService.recoverPatents(patentIds, userId);
		writer.write(1);
		
	}
	
	@RequestMapping(path="/deleteForeverPatents", method=RequestMethod.GET)
	public void deleteForeverPatents(@RequestParam("patentIds") List<Long> patentIds,PrintWriter writer){
		int userId = PrincipalUtils.getCurrentUserId();
		patentMobileService.deleteForeverPatents(patentIds, userId);
		writer.write(1);
	}
	
	
	@RequestMapping(path="/listByCreateTime", method=RequestMethod.GET)
	public String getUserPatentsByCreateTime(Model model, Page page, HttpSession session) {
		int userId = PrincipalUtils.getCurrentUserId();
		page.setUserId(userId);
		page.setPageSize(WebUtils.getPageSize(session));
		if (page.getCurrentPage() <= 0) {
			page.setCurrentPage(1);
		}
		//分页相关
		int totalCount=(int)patentMobileService.getPatentsCount(userId);
		page.setTotalRecords(totalCount);
		Map<String, Map<String, String>> patentTypeCount=patentMobileService.getUserPatentCountByType(userId);
		Map<String, Map<String, String>> patentStatusCount=patentMobileService.searchUserPatentsByPatentStatus(userId);
		List<Patent> patents = patentMobileService.getUserPatentsByCreateTime(page);
		model.addAttribute("patents", patents);
		model.addAttribute("page", page);
		model.addAttribute("patentTypeCount", patentTypeCount);
		model.addAttribute("patentStatusCount", patentStatusCount);
		
		
		addPatentTypeAndStatusDataToModel(model);
		return "patent_list";
	}
	
	
	@RequestMapping(path="/batchAddGoods", method=RequestMethod.GET)
	public void batchAddGoods(@RequestParam("patentIds") List<Long> patentIds,PrintWriter out) throws IOException {
		boolean notExistGoods = patentMobileService.bacthsaveGoodsCheckOut(patentIds);
		int userId=PrincipalUtils.getCurrentUserId();
		  System.out.println(patentMobileService.bacthsaveGoodsCheckOut(patentIds));
		if(!notExistGoods){
			patentMobileService.batchSaveGoods(patentIds, userId);
			patentMobileService.updatePatentsGoodsStatus(patentIds);
			out.write("批量发布成功");
		}else {
			out.write("所选择的专利中包含了已发布的专利，请和核对后再进行发布！");
		}
		
	}
	
	@RequestMapping(path="/changePrice", method=RequestMethod.GET)
	public void changePrice(int price,int patentId,PrintWriter writer) throws IOException {
		patentMobileService.changePrice(price, patentId);
		writer.write(1);
	}
	
	@RequestMapping(path="/changSecondColume", method=RequestMethod.GET)
	public void changSecondColume(int SecondColumn,int patentId,PrintWriter writer) throws IOException {
		patentMobileService.changSecondColume(SecondColumn, patentId);
	}
	
	@RequestMapping(path="/batchChangePrice", method=RequestMethod.GET)
	public void batchChangePrice(@RequestParam("price")int price,@RequestParam("patentIds") List<Long> patentIds,PrintWriter writer) throws IOException {
		patentMobileService.batchChangePrice(price, patentIds);
		
	}
	
	@RequestMapping(path="showRemarks", method=RequestMethod.GET)
	public String showRemarks(@RequestParam("patentId")long patentId, Model model) {		
		List<PatentRemark> remarks = patentMobileService.getPatentRemarks(patentId);
		model.addAttribute("remarks", remarks);
		model.addAttribute("addPatentId", patentId);
		return "patent_remarks";
	}

	@RequestMapping(path="addPatentRemark", method=RequestMethod.POST)
	public String addPatentRemark(@RequestParam("patentId")long patentId, @RequestParam("content") String content,Model model) {		
		int userId = PrincipalUtils.getCurrentUserId();
		patentMobileService.addPatentRemark(patentId,content,userId);		
		return "patent_remarks";
	}	
	
	
	//显示专利详细信息
	/*@RequestMapping(path="showPatentDetail", method=RequestMethod.GET)
	public String showPatentDetail(@RequestParam("patentId")long patentId,@RequestParam("ownerId")int ownerId,Model model) {
		int userId = PrincipalUtils.getCurrentUserId();
		Patent patent = patentMobileService.showPatentDetail(patentId);
		boolean success = false;
		if(userId == patent.getOwnerId()) {
			success = true;
		}
		Map<String, Map<String, String>> patentTypeCount=patentMobileService.getUserPatentCountByType(userId);
		Map<String, Map<String, String>> patentStatusCount=patentMobileService.searchUserPatentsByPatentStatus(userId);
		model.addAttribute("patent", patent);
		model.addAttribute("success", success);
		model.addAttribute("patentTypeCount", patentTypeCount);
		model.addAttribute("patentStatusCount", patentStatusCount);
		addPatentTypeAndStatusDataToModel(model);
		return "patent_update_information";
	}	*/
	
	/*@RequestMapping(path="savePatentDetail", method=RequestMethod.POST)
	public String savePatentDetail(@ModelAttribute Patent patent,Model model) {
		patentMobileService.savePatentDetail(patent);
		long patentId=patent.getPatentId();
		model.addAttribute("patentId", patentId);
		return "redirect:/patent/list.html"; 
	}	*/
	
	/*@RequestMapping(path="/deleteShareUser", method=RequestMethod.GET)
	public void deleteShareUser(@RequestParam("patentId")long patentId,@RequestParam("ownerId")int ownerId,@RequestParam("shareUserId")int shareUserId,Model model,
			HttpServletResponse response) throws IOException{
		patentMobileService.deleteShareUser(patentId,ownerId,shareUserId);
		WebUtils.writeJsonStrToResponse(response, "success");
	}	
	
	@RequestMapping(path="/exportPatentsAllMessage", method=RequestMethod.GET)
	public void exportFeesAllMessage(@RequestParam("patents")List<Long> patentIds, HttpServletResponse response) throws IOException {
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("X-FRAME-OPTIONS", "SAMEORIGIN");

		User user = PrincipalUtils.getCurrentPrincipal();
		String exportExcelName = user.getUsername() + System.currentTimeMillis() + ".xls";
		String exportExcelPath = patentMobileService.patentExportExcel(patentIds, exportExcelName);
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
	}*/
	
	
	@RequestMapping(path="/cancelRecommendPatent", method=RequestMethod.GET)
	public void cancelRecommendPatent(long patentId,PrintWriter writer){
		patentMobileService.cancelRecommendPatent(patentId);
		writer.write(1);
	}
	
	@RequestMapping(path="/recommendPatent", method=RequestMethod.GET)
	public void recommendPatent(long patentId,PrintWriter writer){
		patentMobileService.recommendPatent(patentId);
		writer.write(1);
	}

}
