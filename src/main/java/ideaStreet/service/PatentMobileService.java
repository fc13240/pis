package ideaStreet.service;

import java.util.List;

import ideaStreet.domain.MobilePatent;
import ideaStreet.domain.Page;


public interface PatentMobileService {	
	List<MobilePatent> getUserPatents(Page page);
	
	MobilePatent getPatentById(long patentId);

}
