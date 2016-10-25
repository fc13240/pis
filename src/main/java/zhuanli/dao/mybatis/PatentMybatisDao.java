package zhuanli.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.PatentDao;
import zhuanli.dao.mapper.PatentMapper;
import zhuanli.domain.ColumnCount;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.Notice;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentSearchCondition;



public class PatentMybatisDao extends SqlSessionDaoSupport implements PatentDao {
	private PatentMapper patentMapper;
	
	public void setPatentMapper(PatentMapper patentMapper) {
		this.patentMapper = patentMapper;
	}

	@Override
	public List<Patent> getSecoundColumn(int  patent_column_id) {
		return patentMapper.getSecoundColumn(patent_column_id);
	}

	@Override
	public Patent getPatentById(long patent_id) {
		return patentMapper.getPatentById(patent_id);
	}

	@Override
	public List<Patent> getSonList(int i) {
		return patentMapper.getSonList(i);
	}

	@Override
	public int getSonListCount(int j) {
		return patentMapper.getSonListCount(j);
	}

	@Override
	public List<FirstColumn> selectAllColumns() {
		return patentMapper.selectAllColumns();
	}

	@Override
	public List<Patent> getSecoundPatent(int  patent_second_column) {
		return patentMapper.getSecoundPatent(patent_second_column);
	}

	@Override
	public List<ColumnCount> getColumnCount() {
		return patentMapper.getColumnCount();
	}

	@Override
	public List<FirstColumn> selectAllPatents() {
		return patentMapper.selectAllPatents();
	}

	@Override
	public int getFirstId(int patent_second_column_id) {
		return patentMapper.getFirstId(patent_second_column_id);
	}

	@Override
	public String getCurrentTypeName(int patent_second_column_id) {
		return patentMapper.getCurrentTypeName(patent_second_column_id);
	}

	@Override
	public List<Patent> searchPatents(PatentSearchCondition patentSearchCondition) {
		return patentMapper.searchPatents(patentSearchCondition);
	}

	@Override
	public int searchPatentsCount(PatentSearchCondition patentSearchCondition) {
		return patentMapper.searchPatentsCount(patentSearchCondition);
	}

	@Override
	public List<Patent> getSecoundColumnPage(Page page) {

		return patentMapper.getSecoundColumnPage(page);
	}

	@Override
	public List<Patent> getSecoundPatentPage(Page page) {
		return patentMapper.getSecoundPatentPage(page);
	}

	@Override
	public List<Notice> getNoticeByPatentno(long patent_id) {
	
		return patentMapper.getNoticeByPatentno(patent_id);
	}

	@Override
	public Notice getNoticeById(int noticeId) {
		return patentMapper.getNoticeById(noticeId);
	}

	@Override
	public List<Patent> getAllPatents() {
		
		return patentMapper.getAllPatents();
	}

	@Override
	public List<Patent> getPatents() {
		// TODO Auto-generated method stub
		return patentMapper.getPatents();
	}

	
	
}
