package ideaStreet.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ideaStreet.domain.ColumnCount;
import ideaStreet.domain.FirstColumn;
import ideaStreet.domain.Notice;
import ideaStreet.domain.Page;
import ideaStreet.domain.Patent;
import ideaStreet.domain.PatentSearchCondition;



public interface PatentMapper {
	
//	List<Patent> getPatents();
	
//	List<Patent> getPatentsByColumn(List<Patent> patent_second_columns);
//	
	
	List<Patent> getSecoundColumn(int  patent_column_id);
	
	List<Patent> getSecoundColumnPage(Page  page);

	Patent getPatentById(long patent_id);

	List<Patent> getSonList(int i);

	int getSonListCount(int j);

	List<FirstColumn> selectAllColumns();

	List<Patent> getSecoundPatent(int  patent_second_column);
	
	List<Patent> getSecoundPatentPage(Page  page);

	List<ColumnCount> getColumnCount();

	List<FirstColumn> selectAllPatents();

	int getFirstId(int patent_second_column_id);

	String getCurrentTypeName(int patent_second_column_id);
	List<Patent> searchPatents(PatentSearchCondition patentSearchCondition);
	int searchPatentsCount(PatentSearchCondition patentSearchCondition);

	List<Notice> getNoticeByPatentno(long patent_id);

	Notice getNoticeById(int noticeId);

	List<Patent> getAllPatents();

	List<Patent> getPatents();
	
	List<Patent> getPatentsByShopType(@Param("shopType")int shopType,@Param("page")Page page);
	
	int getPatentsByShopTypeCount(int shopType);
}
