package zhuanli.service;

import java.util.List;

import zhuanli.domain.Patent;


public interface PatentSearchService {
	List<Patent> searchByInventionPatentGrant();
	List<Patent> searchByAbstractsPatent();//发明公布
	List<Patent> searchByUtilityModelPatent();//实用新型
	List<Patent> searchByAppearanceDesignPatent();//外观设计
}
