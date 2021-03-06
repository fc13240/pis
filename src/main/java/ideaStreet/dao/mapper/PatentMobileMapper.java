package ideaStreet.dao.mapper;

import java.util.List;

import ideaStreet.domain.MobilePatent;
import ideaStreet.domain.Page;

public interface PatentMobileMapper {
	
	List<MobilePatent> getUserPatents(Page page);
	
	MobilePatent getPatentById(long patentId);
}
