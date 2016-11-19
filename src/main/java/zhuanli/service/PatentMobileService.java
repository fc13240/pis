package zhuanli.service;

import java.util.List;

import zhuanli.domain.MobilePatent;
import zhuanli.domain.Page;


public interface PatentMobileService {	
	List<MobilePatent> getUserPatents(Page page);
	
	MobilePatent getPatentById(long patentId);

}
