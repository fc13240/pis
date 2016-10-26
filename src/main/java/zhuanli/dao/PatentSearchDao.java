package zhuanli.dao;

import java.util.List;

import org.bson.types.ObjectId;

import zhuanli.domain.Patent;


public interface PatentSearchDao {
	List<Patent> searchByInventionPatentGrant();
	
}
