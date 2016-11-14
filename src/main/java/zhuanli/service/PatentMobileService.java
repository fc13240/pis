package zhuanli.service;

import java.util.List;
import java.util.Map;

import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentRemark;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.domain.PatentStatus;
import zhuanli.domain.PatentType;


public interface PatentMobileService {
    long getPatentsCount(int userId);
	
	List<Patent> getUserPatents(Page page);
	
	List<Patent> getUserPatentsByType(int userId, int patentType);
	
	List<Patent> getUserPatentsByStatus(int userId, int patentStatus);
	
	Patent getPatentDetail(long patentId);
	
	List<Patent> searchUserPatents(PatentSearchCondition searchCondition);
	
	public long searchUserPatentsCount(PatentSearchCondition searchCondition);
	
	List<Patent> searchUserPatentsWithPage(PatentSearchCondition searchCondition);
	
	List<PatentType> getAllPatentTypes();
	
	List<PatentStatus> getAllPatentStatus();
	
	void changeInternalCode(int patentId, String internalCode);
	

	//boolean uploadPatents(InputStream is,int userId) throws IOException;

	//List<GoodsFirstColumn> getFirstColumn();

	//List<GoodsSecondColumn> getSecondColumn(int firstColumnId);

	//void saveGoods(GoodsDetail goodsDetail);
	
	// void addPatent(Patent patent);
	 
	 Map<String, Map<String, String>> getUserPatentCountByType( int userId);
	 
	 Map<String, Map<String, String>> searchUserPatentsByPatentStatus(int userId);
	 
	 List<Patent> getUserPatentsWithFee(int userId);
	 
	 Patent getPatentsByAppNo(Integer userId,String appNo);
	 
	 Long getPatentIdByAppNo(Integer userId,String appNo);
	 
	 //自动更新专利
	 //void autoUpdatePatents(InputStream is,int userId) throws IOException;
	 
	 
	 public boolean  addOrUpdatePatents(List<Patent> patents,int userId);
	 
	 //List<GoodsDetail> getUserTransactionPatents(Page page);
	 
	 int getUserTransactionPatentsCount(int userId);

	 //List<GoodsDetail> searchTransactionPatentsByPage(TransactionPatentSearchCondition searchCondition);
		
	 //int searchTransactionPatentsCount(TransactionPatentSearchCondition searchCondition);
	
	void downTransactionPatent(int patentId);

	void upTransactionPatent(int patentId);

	void deleteTransactionPatent(int patentId);
	
	void patentsTrash(List<Long> patentIds,int userId);

	List<Patent> getPatentsRecycled(Page page);
	
	int getPatentsRecycledCount(int userId);
	
	void recoverPatents(List<Long> patentIds,int userId );
	
	void deleteForeverPatents(List<Long> patentIds,int userId);
	
	List<Patent> getUserPatentsByCreateTime(Page page);
	
	void batchSaveGoods(List<Long> patentIds,int userId);
	
	void updatePatentsGoodsStatus(List<Long> patentIds);
	
	void updateGoodPatents(int price,int SecondColumn,int patentId);
	

	void changePrice(int price,int patentId);
	
	void changSecondColume(int SecondColumn,int patentId);
	
	void batchChangePrice(int price,List<Long> patentIds);

	boolean bacthsaveGoodsCheckOut(List<Long> patentIds);
	
	List<PatentRemark> getPatentRemarks(long patentId);
	
	void addPatentRemark(long patentId,String content,int userId);
	
	Patent showPatentDetail(long patentId);
	
	boolean savePatentDetail(Patent patent);
	
	void deleteShareUser(long patentId,int ownerId,int shareUserId);
	
	//String patentExportExcel(List<Long> patentIds,String exportExcelName) throws IOException;
	
	void cancelRecommendPatent(long patentId);
	
	void recommendPatent(long patentId);
}
