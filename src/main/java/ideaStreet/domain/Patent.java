package ideaStreet.domain;

import java.util.Date;

import org.bson.types.ObjectId;

public class Patent {
	private ObjectId id;
	private int patent_id;
	private int  price;
	private String patent_name;
	private int patent_second_column;
	private Date app_date;
	private Date publish_date;
	private Date add_date;
	private int patent_type;
	private String patent_type_name;
	private String patent_type_desc;
	private String patent_second_column_name;
	private String patent_first_column_name;
	private int patent_status;
	private String patent_status_desc;
	private String app_no;
	private String app_person;
	private String owner;
	private int patent_second_column_id;
	private int patent_first_column_id;
	private int transaction_type;
	
	
	
	
	public ObjectId getId() {
		return id;
	}



	public void setId(ObjectId id) {
		this.id = id;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public int getPatent_id() {
		return patent_id;
	}



	public void setPatent_id(int patent_id) {
		this.patent_id = patent_id;
	}


	public int getPatent_second_column() {
		return patent_second_column;
	}



	public void setPatent_second_column(int patent_second_column) {
		this.patent_second_column = patent_second_column;
	}



	public String getPatent_first_column_name() {
		return patent_first_column_name;
	}



	public void setPatent_first_column_name(String patent_first_column_name) {
		this.patent_first_column_name = patent_first_column_name;
	}



	public String getPatent_second_column_name() {
		return patent_second_column_name;
	}



	public void setPatent_second_column_name(String patent_second_column_name) {
		this.patent_second_column_name = patent_second_column_name;
	}



	public int getPatent_status() {
		return patent_status;
	}



	public void setPatent_status(int patent_status) {
		this.patent_status = patent_status;
	}



	public String getPatent_status_desc() {
		return patent_status_desc;
	}



	public void setPatent_status_desc(String patent_status_desc) {
		this.patent_status_desc = patent_status_desc;
	}



	public String getApp_no() {
		return app_no;
	}



	public void setApp_no(String app_no) {
		this.app_no = app_no;
	}



	public String getApp_person() {
		return app_person;
	}



	public void setApp_person(String app_person) {
		this.app_person = app_person;
	}



	public Date getApp_date() {
		return app_date;
	}



	public int getPatent_second_column_id() {
		return patent_second_column_id;
	}



	public void setPatent_second_column_id(int patent_second_column_id) {
		this.patent_second_column_id = patent_second_column_id;
	}



	public int getPatent_first_column_id() {
		return patent_first_column_id;
	}



	public void setPatent_first_column_id(int patent_first_column_id) {
		this.patent_first_column_id = patent_first_column_id;
	}



	public Date getAdd_date() {
		return add_date;
	}



	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}



	public Date getPublish_date() {
		return publish_date;
	}



	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}



	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}



	public int getPatent_type() {
		return patent_type;
	}



	public void setPatent_type(int patent_type) {
		this.patent_type = patent_type;
	}



	public String getPatent_type_name() {
		return patent_type_name;
	}



	public void setPatent_type_name(String patent_type_name) {
		this.patent_type_name = patent_type_name;
	}



	public String getPatent_type_desc() {
		return patent_type_desc;
	}



	public void setPatent_type_desc(String patent_type_desc) {
		this.patent_type_desc = patent_type_desc;
	}


	public String getPatent_name() {
		return patent_name;
	}



	public void setPatent_name(String patent_name) {
		this.patent_name = patent_name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getTransaction_type() {
		return transaction_type;
	}



	public void setTransaction_type(int transaction_type) {
		this.transaction_type = transaction_type;
	}



	
	

}
