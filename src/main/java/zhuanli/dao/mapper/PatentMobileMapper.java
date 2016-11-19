package zhuanli.dao.mapper;

import java.util.List;

import zhuanli.domain.MobilePatent;
import zhuanli.domain.Page;

public interface PatentMobileMapper {
	
	List<MobilePatent> getUserPatents(Page page);
	
	MobilePatent getPatentById(long patentId);
}
