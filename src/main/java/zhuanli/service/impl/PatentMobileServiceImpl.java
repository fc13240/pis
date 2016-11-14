package zhuanli.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import zhuanli.dao.PatentMobileDao;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentRemark;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.PatentStatus;
import zhuanli.domain.PatentType;
import zhuanli.service.PatentMobileService;



public class PatentMobileServiceImpl implements PatentMobileService {
	private PatentMobileDao patentMobileDao;
	//private SharePatentDao sharePatentDao;
	
	public PatentMobileServiceImpl(PatentMobileDao patentMobileDao) {
	//public PatentServiceImpl(PatentDao patentDao, SharePatentDao sharePatentDao) {
		this.patentMobileDao = patentMobileDao;
		//this.sharePatentDao = sharePatentDao;
	}
	
	/*
	 * 专利分页相关
	 */
	public long getPatentsCount(int userId){
		return patentMobileDao.getUserPatentCount(userId);
	}
	@Override
	public List<Patent> getUserPatents(Page page) {
		return patentMobileDao.getUserPatents(page);
	}
	
	@Override
	public List<Patent> getUserPatentsByType(int userId, int patentType) {
		return patentMobileDao.getUserPatentsByType(userId, patentType);
	}	
	
	@Override
	public List<Patent> getUserPatentsByStatus(int userId, int patentStatus) {
		return patentMobileDao.getUserPatentsByStatus(userId, patentStatus);
	}	
	
	@Override
	public Patent getPatentDetail(long patentId) {
		return patentMobileDao.getPatentById(patentId);
	}
	
	@Override
	public List<Patent> searchUserPatents(PatentSearchCondition searchCondition) {
		return patentMobileDao.searchUserPatents(searchCondition);
	}
	//搜索专利分页
	@Override
	public long searchUserPatentsCount(PatentSearchCondition searchCondition){
		return patentMobileDao.searchUserPatentsCount(searchCondition);
	}
	
	@Override
	public List<Patent> searchUserPatentsWithPage(PatentSearchCondition searchCondition) {
		return patentMobileDao.searchUserPatentsByPage(searchCondition);
	}
	
	@Override
	public List<PatentType> getAllPatentTypes() {
		return patentMobileDao.getAllPatentTypes();
	}
	
	@Override
	public List<PatentStatus> getAllPatentStatus() {
		return patentMobileDao.getAllPatentStatus();
	}

	@Override
	@Transactional
	public void changeInternalCode(int patentId, String internalCode) {
		patentMobileDao.updateInternalCode(patentId, internalCode);
	}

	/*@Override
	public boolean  uploadPatents(InputStream is,int userId) throws IOException {
		List<Patent> patents = PatentExcelParser.parsePatentFile(is,userId);
		return addOrUpdatePatents(patents, userId);
	}*/
	
	@Override
	@Transactional
	public boolean  addOrUpdatePatents(List<Patent> patents,int userId) {
		for (Patent patent: patents) {
			 patentMobileDao.insertOrUpdatePatent(patent);
		}
		List<Map<String, Integer>> userPatentList = new ArrayList<>();
		for (Patent patent: patents) {
			boolean isNewPatent = patent.getPatent_id() != 0;
			if (isNewPatent) {
				HashMap<String, Integer> userPatentMap = new HashMap<>();
				userPatentMap.put("user", userId);
				userPatentMap.put("patent", (int)patent.getPatent_id());
				userPatentList.add(userPatentMap);
			}
		}
		/*if (userPatentList.size() > 0) {
			sharePatentDao.insertUserPatents(userPatentList);
		}*/
		return true;
	}

	/*@Override
	public List<GoodsFirstColumn> getFirstColumn() {
		
		return  patentMobileDao.getFirstColumn();
	}*/

	/*@Override
	public List<GoodsSecondColumn> getSecondColumn(int firstColumnId) {
		
		return  patentMobileDao.getSecondColumn(firstColumnId);
	}*/

	/*@Override
	public void saveGoods(GoodsDetail goodsDetail) {
		
		patentMobileDao.saveGoods(goodsDetail);
	}*/

	/*@Override
	@Transactional
	public void addPatent(Patent patent) {
		patentMobileDao.insertOrUpdatePatent(patent);
		long patentId = patent.getPatent_id();
		boolean isNewPatent = patentId != 0;
		if (isNewPatent) {
			List<Map<String, Integer>> userPatentList = new ArrayList<>();
			HashMap<String, Integer> userPatentMap = new HashMap<>();
			userPatentMap.put("user", patent.getOwnerId());
			userPatentMap.put("patent", (int) patentId);
			userPatentList.add(userPatentMap);
			sharePatentDao.insertUserPatents(userPatentList);
		}
	}*/

	@Override
	public Map<String, Map<String, String>> getUserPatentCountByType(int userId) {
		return patentMobileDao.getUserPatentCountByType(userId);
	}

	@Override
	public Map<String, Map<String, String>> searchUserPatentsByPatentStatus(int userId) {
		return patentMobileDao.searchUserPatentsByPatentStatus(userId);
	}

	@Override
	public List<Patent> getUserPatentsWithFee(int userId) {
		return patentMobileDao.getUserPatentsWithFee(userId);
	}

	@Override
	public Patent getPatentsByAppNo(Integer userId,String appNo) {
		return patentMobileDao.getPatentsByAppNo(userId,appNo);
	}

	@Override
	public Long getPatentIdByAppNo(Integer userId,String appNo) {
		return patentMobileDao.getPatentIdByAppNo(userId,appNo);
	}

	/*@Override
	public void autoUpdatePatents(InputStream is,int userId) throws IOException {
		List<Patent> patents = PatentExcelParser.parsePatentFile(is,userId);
		addOrUpdatePatents(patents, userId);
	}*/

//	@Override
//	public String generatePatentExportExcel(List<Long> patentIds,String excelName) throws IOException {
//		List<Patent> patents=patentDao.getPatentsByIds(patentIds);
//		String exportExcelPath=Settings.TEMP_DIR+excelName;
//		PatentExcelGenerator.writerPatentRecodesToExcel(patents, exportExcelPath);
//		return exportExcelPath;
//	}

	/*@Override
	public List<GoodsDetail> getUserTransactionPatents(Page page) {
		return patentMobileDao.getUserTransactionPatents(page);
	}*/

	@Override
	public int getUserTransactionPatentsCount(int userId) {
		return patentMobileDao.getUserTransactionPatentsCount(userId);
	}

	/*@Override
	public List<GoodsDetail> searchTransactionPatentsByPage(TransactionPatentSearchCondition searchCondition) {
		return patentMobileDao.searchTransactionPatentsByPage(searchCondition);
	}*/

	/*@Override
	public int searchTransactionPatentsCount(TransactionPatentSearchCondition searchCondition) {
		return patentMobileDao.searchTransactionPatentsCount(searchCondition);
	}*/
	
	@Override
	public void downTransactionPatent(int patentId) {
		patentMobileDao.downTransactionPatent(patentId);
	}

	@Override
	public void upTransactionPatent(int patentId) {
		patentMobileDao.upTransactionPatent(patentId);
	}

	@Override
	public void deleteTransactionPatent(int patentId) {
		patentMobileDao.deleteTransactionPatent(patentId);
	}

	@Override
	public void patentsTrash(List<Long> patentIds,int userId) {
		patentMobileDao.patentsTrash(patentIds,userId);
		
	}

	@Override
	public List<Patent> getPatentsRecycled(Page page) {
		return patentMobileDao.getPatentsRecycled(page);
	}

	@Override
	public int getPatentsRecycledCount(int userId) {
		return patentMobileDao.getPatentsRecycledCount(userId);
	}

	@Override
	public void recoverPatents(List<Long> patentIds, int userId) {
		patentMobileDao.recoverPatents(patentIds, userId);
		
	}

	@Override
	public void deleteForeverPatents(List<Long> patentIds, int userId) {
		patentMobileDao.deleteForeverPatents(patentIds, userId);
	}

	@Override
	public List<Patent> getUserPatentsByCreateTime(Page page) {
		return patentMobileDao.getUserPatentsByCreateTime(page);
	}

	@Override
	public void batchSaveGoods(List<Long> patentIds, int userId) {
		patentMobileDao.batchSaveGoods(patentIds, userId);
		
	}

	@Override
	public void updatePatentsGoodsStatus(List<Long> patentIds) {
		patentMobileDao.updatePatentsGoodsStatus(patentIds);
		
	}

	@Override
	public void updateGoodPatents(int price, int SecondColumn, int patentId) {
		patentMobileDao.updateGoodPatents(price, SecondColumn, patentId);
	}

	@Override
	public void changePrice(int price, int patentId) {
		patentMobileDao.changePrice(price, patentId);
		
	}

	@Override
	public void changSecondColume(int SecondColumn, int patentId) {
		patentMobileDao.changSecondColume(SecondColumn, patentId);
	}

	@Override
	public void batchChangePrice(int price, List<Long> patentIds) {
		patentMobileDao.batchChangePrice(price, patentIds);
	}
	public boolean bacthsaveGoodsCheckOut(List<Long> patentIds) {
		int findPatentSize = patentMobileDao.bacthsaveGoodsCheckOut(patentIds);
		if(findPatentSize>0){
			return true;
		}else {
			
			return false;
		}

	}

	@Override
	public List<PatentRemark> getPatentRemarks(long patentId) {
		return patentMobileDao.getPatentRemarks(patentId);
	}

	@Override
	public void addPatentRemark(long patentId, String content,int userId) {
		
		 patentMobileDao.addPatentRemark(patentId,content,userId);
	}

	@Override
	public Patent showPatentDetail(long patentId) {
		
		return  patentMobileDao.showPatentDetail(patentId);
	}

	@Override
	public boolean savePatentDetail(Patent patent) {
		
		return patentMobileDao.savePatentDetail(patent);
	}

	@Override
	@Transactional
	public void deleteShareUser(long patentId, int ownerId, int shareUserId) {
		
		 patentMobileDao.deleteShareUser(patentId,ownerId,shareUserId);
	}

	/*@Override
	public String patentExportExcel(List<Long> patentIds, String exportExcelName) throws IOException {
		List<Patent> patents = patentMobileDao.getUserPatentsByIds(patentIds);
		String exportExcelPath=Settings.TEMP_DIR+exportExcelName;
		PatentExcelGenerator.writePatentRecordsToExcel(patents, exportExcelPath);
		return exportExcelPath;
	}*/

	@Override
	public void cancelRecommendPatent(long patentId) {
		patentMobileDao.cancelRecommendPatent(patentId);
		
	}

	@Override
	public void recommendPatent(long patentId) {
		patentMobileDao.recommendPatent(patentId);
		
	}

	/*@Override
	public boolean uploadPatents(InputStream is, int userId) throws IOException {
		// TODO Auto-generated method stub
		return patentMobileDao.uploadPatent;
	}*/

}
