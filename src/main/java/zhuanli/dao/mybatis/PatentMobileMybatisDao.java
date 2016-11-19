package zhuanli.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.PatentMobileDao;
import zhuanli.dao.mapper.PatentMobileMapper;
import zhuanli.domain.MobilePatent;
import zhuanli.domain.Page;



public class PatentMobileMybatisDao extends SqlSessionDaoSupport implements PatentMobileDao {
	private PatentMobileMapper patentMobileMapper;
	

	public PatentMobileMapper getPatentMobileMapper() {
		return patentMobileMapper;
	}

	public void setPatentMobileMapper(PatentMobileMapper patentMobileMapper) {
		this.patentMobileMapper = patentMobileMapper;
	}

	@Override
	public List<MobilePatent> getUserPatents(Page page) {
		return patentMobileMapper.getUserPatents(page);
	}

	@Override
	public MobilePatent getPatentById(long patentId) {
		return patentMobileMapper.getPatentById(patentId);
	}


}