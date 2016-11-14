package zhuanli.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.PatentMobileDao;
import zhuanli.dao.mapper.PatentMobileMapper;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentRemark;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.PatentStatus;
import zhuanli.domain.PatentType;
import zhuanli.util.PrincipalUtils;



public class PatentMobileMybatisDao extends SqlSessionDaoSupport implements PatentMobileDao {
	private PatentMobileMapper patentMobileMapper;
	
	@Override
	public List<Patent> getUserPatentsByType(int userId, int patentType) {
		return patentMobileMapper.getUserPatentsByType(userId, patentType);
	}

	@Override
	public List<Patent> getUserPatentsByStatus(int userId, int patentStatus) {
		return patentMobileMapper.getUserPatentsByStatus(userId, patentStatus);
	}

	@Override
	public List<Patent> getUserPatents(Page page) {
		return patentMobileMapper.getUserPatents(page);
	}
	
	@Override
	public Patent getPatentById(long patentId) {
		return patentMobileMapper.getPatentById(patentId);
	}
	

	@Override
	public Patent getPatentByAppNoAndOwner(String appNo, int ownerId) {
		return patentMobileMapper.getPatentByAppNoAndOwner(appNo, ownerId);
	}
	
	@Override
	public List<Patent> searchUserPatents(PatentSearchCondition searchCondition) {
		return patentMobileMapper.searchUserPatents(searchCondition);
	}
	
	@Override
	public List<Patent> searchUserPatentsByPage(PatentSearchCondition searchCondition) {
		Page page = searchCondition.getPage();
		page.setUserId(PrincipalUtils.getCurrentUserId());
		int userPatentCount = patentMobileMapper.getUserPatentCount(page.getUserId());
		page.setTotalRecords(userPatentCount);
		return patentMobileMapper.searchUserPatentsByPage(searchCondition);
	}

	@Override
	public List<PatentType> getAllPatentTypes() {
		return patentMobileMapper.getAllPatentTypes();
	}
	
	@Override
	public List<PatentStatus> getAllPatentStatus() {
		return patentMobileMapper.getAllPatentStatus();
	}
	
	@Override
	public void updateInternalCode(int patentId, String internalCode) {
		patentMobileMapper.updateInternalCode(patentId, internalCode);
	}

	@Override
	public long insertOrUpdatePatent(Patent patent) {
		return patentMobileMapper.insertOrUpdatePatent(patent);
	}

	@Override
	public void insertPatent(Patent patent) {
		patentMobileMapper.insertPatent(patent);
	}

	@Override
	public void updatePatent(Patent patent) {
		patentMobileMapper.updatePatent(patent);
	}

	@Override
	public List<Patent> getPatentsByIds(List<Long> patentIds) {
		return patentMobileMapper.getPatentsByIds(patentIds);
	}

	@Override
	public int getUserPatentCount(int userId) {
		return patentMobileMapper.getUserPatentCount(userId);
	}

	@Override
	public int searchUserPatentsCount(PatentSearchCondition searchCondition) {
		return patentMobileMapper.searchUserPatentsCount(searchCondition);
	}

	/*@Override
	public List<GoodsFirstColumn> getFirstColumn() {
		
		return patentMobileMapper.getFirstColumn();
	}*/

	/*@Override
	public List<GoodsSecondColumn> getSecondColumn(int firstColumnId) {
		return patentMobileMapper.getSecondColumn(firstColumnId);
	}*/

	/*@Override
	public void saveGoods(GoodsDetail goodsDetail) {
		patentMobileMapper.saveGoods(goodsDetail);
	}*/

	@Override
	public void addPatent(Patent patent) {
		patentMobileMapper.addPatent(patent);
		
	}

	@Override
	public Map<String, Map<String, String>> getUserPatentCountByType(int userId) {
		return patentMobileMapper.getUserPatentCountByType(userId);
	}

	@Override
	public Map<String, Map<String, String>> searchUserPatentsByPatentStatus(int userId) {
		return patentMobileMapper.searchUserPatentsByPatentStatus(userId);
	}

	@Override
	public List<Patent> getUserPatentsWithFee(int userId) {
		return patentMobileMapper.getUserPatentsWithFee(userId);
	}

	@Override
	public Patent getPatentsByAppNo(Integer userId,String appNo) {
		return patentMobileMapper.getPatentsByAppNo(userId,appNo);
	}

	@Override
	public Long getPatentIdByAppNo(Integer userId,String appNo) {
		return patentMobileMapper.getPatentIdByAppNo(userId,appNo);
	}

	/*@Override
	public List<GoodsDetail> getUserTransactionPatents(Page page) {
		return patentMobileMapper.getUserTransactionPatents(page);
	}*/

	@Override
	public int getUserTransactionPatentsCount(int userId) {
		return patentMobileMapper.getUserTransactionPatentsCount(userId);
	}

	/*@Override
	public List<GoodsDetail> searchTransactionPatentsByPage(TransactionPatentSearchCondition searchCondition) {
		return patentMobileMapper.searchTransactionPatentsByPage(searchCondition);
	}*/

	/*@Override
	public int searchTransactionPatentsCount(TransactionPatentSearchCondition searchCondition) {
		return patentMobileMapper.searchTransactionPatentsCount(searchCondition);
	}*/
	
	@Override
	public void downTransactionPatent(int patentId) {
		patentMobileMapper.downTransactionPatent(patentId);
	}

	@Override
	public void upTransactionPatent(int patentId) {
		patentMobileMapper.upTransactionPatent(patentId);
	}

	@Override
	public void deleteTransactionPatent(int patentId) {
		patentMobileMapper.deleteTransactionPatent(patentId);
	}

	@Override
	public void patentsTrash(List<Long> patentIds,int userId) {
		patentMobileMapper.patentsTrash(patentIds,userId);
	}

	@Override
	public List<Patent> getPatentsRecycled(Page page) {
		return patentMobileMapper.getPatentsRecycled(page);
	}

	@Override
	public int getPatentsRecycledCount(int userId) {
		return patentMobileMapper.getPatentsRecycledCount(userId);
	}

	@Override
	public void recoverPatents(List<Long> patentIds, int userId) {
		patentMobileMapper.recoverPatents(patentIds, userId);
		
	}

	@Override
	public void deleteForeverPatents(List<Long> patentIds, int userId) {
		patentMobileMapper.deleteForeverPatents(patentIds, userId);
		
	}

	@Override
	public List<Patent> getUserPatentsByCreateTime(Page page) {
		return patentMobileMapper.getUserPatentsByCreateTime(page);
	}

	@Override
	public void batchSaveGoods(List<Long> patentIds, int userId) {
		patentMobileMapper.batchSaveGoods(patentIds, userId);
		
	}

	@Override
	public void updatePatentsGoodsStatus(List<Long> patentIds) {
		patentMobileMapper.updatePatentsGoodsStatus(patentIds);
		
	}

	@Override
	public void updateGoodPatents(int price, int patentSecondColumn, int patentId) {
		patentMobileMapper.updateGoodPatents(price, patentSecondColumn, patentId);
	}

	@Override

	public void changePrice(int price, int patentId) {
		patentMobileMapper.changePrice(price, patentId);
	}

	@Override
	public void changSecondColume(int SecondColumn, int patentId) {
		patentMobileMapper.changSecondColume(SecondColumn, patentId);
	}

	@Override
	public void batchChangePrice(int price, List<Long> patentIds) {
		patentMobileMapper.batchChangePrice(price, patentIds);
	}
	public int bacthsaveGoodsCheckOut(List<Long> patentIds) {
		return patentMobileMapper.bacthsaveGoodsCheckOut(patentIds);

	}

	@Override
	public List<PatentRemark> getPatentRemarks(long patentId) {
		
		return patentMobileMapper.getPatentRemarks(patentId);
	}

	@Override
	public void addPatentRemark(long patentId, String content,int userId) {
		patentMobileMapper.addPatentRemark(patentId,content,userId);
	}

	@Override
	public Patent showPatentDetail(long patentId) {
		return patentMobileMapper.showPatentDetail(patentId);
	}

	@Override
	public boolean savePatentDetail(Patent patent) {
		
		return patentMobileMapper.savePatentDetail(patent);
	}

	@Override
	public void deleteShareUser(long patentId, int ownerId, int shareUserId) {
		
		patentMobileMapper.deleteShareUser(patentId,ownerId,shareUserId);
	}

	@Override
	public List<Integer> getPatentDocShareUesrs(String internalCode) {
		return patentMobileMapper.getPatentDocShareUesrs(internalCode);
	}
	
	@Override
	public Long getPatentIdByInternalCode(String internalCode,int currentUserId) {
		return patentMobileMapper.getPatentIdByInternalCode(internalCode,currentUserId);
	}

//	@Override
//	public void savePatentShareUser(List<Integer> userIds, long patentId) {
//		patentMapper.savePatentShareUser(userIds, patentId);
//	}
	
	@Override
	public void savePatentShareUser(int userId, long patentId) {
		patentMobileMapper.savePatentShareUser(userId, patentId);
	}
	@Override
	public List<Patent> getUserPatentsByIds(List<Long> patentIds) {
		return patentMobileMapper.getUserPatentsByIds(patentIds);
	}

	@Override
	public void updateDocumentStatusText(String patentStatusText, String internalCode) {
		patentMobileMapper.updateDocumentStatusText(patentStatusText, internalCode);
	}

	@Override
	public void updateDocumentStatus(int patentStatus, String internalCode) {
		patentMobileMapper.updateDocumentStatus(patentStatus, internalCode);
	}

	@Override
	public void cancelRecommendPatent(long patentId) {
		patentMobileMapper.cancelRecommendPatent(patentId);
		
	}

	@Override
	public void recommendPatent(long patentId) {
		patentMobileMapper.recommendPatent(patentId);
		
	}

	public PatentMobileMapper getPatentMobileMapper() {
		return patentMobileMapper;
	}

	public void setPatentMobileMapper(PatentMobileMapper patentMobileMapper) {
		this.patentMobileMapper = patentMobileMapper;
	}


}