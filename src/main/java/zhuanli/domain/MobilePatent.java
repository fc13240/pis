package zhuanli.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class MobilePatent {
	private long patentId;
	private ObjectId objectId;
	private String appNo;
	private String name;
	private String publishNo;
	private PatentType patentType;
	@DateTimeFormat(iso = ISO.DATE_TIME, pattern = "yyyy-MM-dd")
	private Date appDate;
	@DateTimeFormat(iso = ISO.DATE_TIME, pattern = "yyyy-MM-dd")
	private Date publishDate;
	private String appPerson;
	private String inventPerson;
	private PatentStatus patentStatus;
	private String patentStatusText;
	private String internalCode;
	private int ownerId;
	private String proxyOrg;
	private String transactionStatus;
	private List<User> shareUsers;
	private Timestamp createTime;
	public long getPatentId() {
		return patentId;
	}
	public void setPatentId(long patentId) {
		this.patentId = patentId;
	}
	public ObjectId getObjectId() {
		return objectId;
	}
	public void setObjectId(ObjectId objectId) {
		this.objectId = objectId;
	}
	public String getAppNo() {
		return appNo;
	}
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishNo() {
		return publishNo;
	}
	public void setPublishNo(String publishNo) {
		this.publishNo = publishNo;
	}
	public PatentType getPatentType() {
		return patentType;
	}
	public void setPatentType(PatentType patentType) {
		this.patentType = patentType;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getAppPerson() {
		return appPerson;
	}
	public void setAppPerson(String appPerson) {
		this.appPerson = appPerson;
	}
	public String getInventPerson() {
		return inventPerson;
	}
	public void setInventPerson(String inventPerson) {
		this.inventPerson = inventPerson;
	}
	public PatentStatus getPatentStatus() {
		return patentStatus;
	}
	public void setPatentStatus(PatentStatus patentStatus) {
		this.patentStatus = patentStatus;
	}
	public String getPatentStatusText() {
		return patentStatusText;
	}
	public void setPatentStatusText(String patentStatusText) {
		this.patentStatusText = patentStatusText;
	}
	public String getInternalCode() {
		return internalCode;
	}
	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getProxyOrg() {
		return proxyOrg;
	}
	public void setProxyOrg(String proxyOrg) {
		this.proxyOrg = proxyOrg;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public List<User> getShareUsers() {
		return shareUsers;
	}
	public void setShareUsers(List<User> shareUsers) {
		this.shareUsers = shareUsers;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	
}
