package zhuanli.service;

import java.util.List;

import zhuanli.domain.Patent;


public interface PatentSearchService {
	List<Patent> searchByInventionPatentGrant();
}
