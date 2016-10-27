package zhuanli.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.elasticsearch.client.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import zhuanli.dao.PatentSearchDao;
import zhuanli.domain.Patent;

public class PatentSearchDaoImpl implements PatentSearchDao{
	private MongoClient mongoClient;
	
	public PatentSearchDaoImpl(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	@Override
	public  List<Patent> searchByInventionPatentGrant() {
		MongoDatabase db = mongoClient.getDatabase("sopatent");
		MongoCollection<Document> collection = db.getCollection("patent");
		List<Document> docs = collection.find(new BasicDBObject("patentType", "发明授权")).sort(new BasicDBObject("_id",-1)).limit(10).into(new ArrayList<Document>());
		List<Patent> patents = new ArrayList<>(docs.size());
		for (Document doc: docs) {
			Patent patent = convertDocToPatent(doc);
			patents.add(patent);
		}
		
		return patents;
	}
	
	private Patent convertDocToPatent(Document doc) {
		Patent patent = new Patent();
		patent.setId(doc.getObjectId("_id"));
		patent.setPatent_name(doc.getString("patentName"));
		return patent;
	}

	@Override
	public List<Patent> searchByAbstractsPatent() {
		MongoDatabase db = mongoClient.getDatabase("sopatent");
		MongoCollection<Document> collection = db.getCollection("patent");
		List<Document> docs = collection.find(new BasicDBObject("patentType", "发明公布")).sort(new BasicDBObject("_id",-1)).limit(10).into(new ArrayList<Document>());
		List<Patent> patents = new ArrayList<>(docs.size());
		for (Document doc: docs) {
			Patent patent = convertDocToPatent(doc);
			patents.add(patent);
		}
		
		return patents;
	}

	@Override
	public List<Patent> searchByUtilityModelPatent() {
		MongoDatabase db = mongoClient.getDatabase("sopatent");
		MongoCollection<Document> collection = db.getCollection("patent");
		List<Document> docs = collection.find(new BasicDBObject("patentType", "实用新型")).sort(new BasicDBObject("_id",-1)).limit(10).into(new ArrayList<Document>());
		List<Patent> patents = new ArrayList<>(docs.size());
		for (Document doc: docs) {
			Patent patent = convertDocToPatent(doc);
			patents.add(patent);
		}
		
		return patents;
	}

	@Override
	public List<Patent> searchByAppearanceDesignPatent() {
		MongoDatabase db = mongoClient.getDatabase("sopatent");
		MongoCollection<Document> collection = db.getCollection("patent");
		List<Document> docs = collection.find(new BasicDBObject("patentType", "外观设计")).sort(new BasicDBObject("_id",-1)).limit(10).into(new ArrayList<Document>());
		List<Patent> patents = new ArrayList<>(docs.size());
		for (Document doc: docs) {
			Patent patent = convertDocToPatent(doc);
			patents.add(patent);
		}
		
		return patents;
	}
	

}