package ideaStreet.dao;

import java.util.List;

import ideaStreet.domain.MobilePatent;
import ideaStreet.domain.Page;

public interface PatentMobileDao {
	List<MobilePatent> getUserPatents(Page page);
	
	MobilePatent getPatentById(long patentId);
	
}
