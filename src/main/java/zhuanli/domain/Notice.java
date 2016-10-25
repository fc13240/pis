package zhuanli.domain;

import java.util.Date;

public class Notice {
	private String noticeSequence;
	private String noticeId;
	private String dispatchSequence;
	private Integer timeLimt;
	private int remainDays;
	private Date dispatchDate;
	private Patent patent;
	private String name;
	private String noticeCode;
	private String zipBid;
	private String dmhFlag;
	private String archiveNo;
	private String zipfileName;
	public String getNoticeSequence() {
		return noticeSequence;
	}
	public void setNoticeSequence(String noticeSequence) {
		this.noticeSequence = noticeSequence;
	}
	public String getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getDispatchSequence() {
		return dispatchSequence;
	}
	public void setDispatchSequence(String dispatchSequence) {
		this.dispatchSequence = dispatchSequence;
	}
	public Integer getTimeLimt() {
		return timeLimt;
	}
	public void setTimeLimt(Integer timeLimt) {
		this.timeLimt = timeLimt;
	}
	public int getRemainDays() {
		return remainDays;
	}
	public void setRemainDays(int remainDays) {
		this.remainDays = remainDays;
	}
	public Date getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public Patent getPatent() {
		return patent;
	}
	public void setPatent(Patent patent) {
		this.patent = patent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoticeCode() {
		return noticeCode;
	}
	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}
	public String getZipBid() {
		return zipBid;
	}
	public void setZipBid(String zipBid) {
		this.zipBid = zipBid;
	}
	public String getDmhFlag() {
		return dmhFlag;
	}
	public void setDmhFlag(String dmhFlag) {
		this.dmhFlag = dmhFlag;
	}
	public String getArchiveNo() {
		return archiveNo;
	}
	public void setArchiveNo(String archiveNo) {
		this.archiveNo = archiveNo;
	}
	public String getZipfileName() {
		return zipfileName;
	}
	public void setZipfileName(String zipfileName) {
		this.zipfileName = zipfileName;
	}






}
