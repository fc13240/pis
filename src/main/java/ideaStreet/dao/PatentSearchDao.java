package ideaStreet.dao;

import java.util.List;

import org.bson.types.ObjectId;

import ideaStreet.domain.Patent;


public interface PatentSearchDao {
	List<Patent> searchByInventionPatentGrant();//发明授权
	List<Patent> searchByAbstractsPatent();//发明公布
	List<Patent> searchByUtilityModelPatent();//实用新型
	List<Patent> searchByAppearanceDesignPatent();//外观设计
	
}
