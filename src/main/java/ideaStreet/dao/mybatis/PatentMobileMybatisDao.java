package ideaStreet.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import ideaStreet.dao.PatentMobileDao;
import ideaStreet.dao.mapper.PatentMobileMapper;
import ideaStreet.domain.MobilePatent;
import ideaStreet.domain.Page;



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