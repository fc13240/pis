package zhuanli.dao;

import java.util.List;

import zhuanli.domain.MobilePatent;
import zhuanli.domain.Page;

public interface PatentMobileDao {
	List<MobilePatent> getUserPatents(Page page);
	
	MobilePatent getPatentById(long patentId);
	
}
