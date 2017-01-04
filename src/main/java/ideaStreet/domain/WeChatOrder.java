package ideaStreet.domain;

import java.util.Date;

public class WeChatOrder {
	private int id;
	private String wechatOrderId;
	private String wechatName;
	private int brandId;
	private int totalFee;
	private Date payTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWechatOrderId() {
		return wechatOrderId;
	}
	public void setWechatOrderId(String wechatOrderId) {
		this.wechatOrderId = wechatOrderId;
	}
	public String getWechatName() {
		return wechatName;
	}
	public void setWechatName(String wechatName) {
		this.wechatName = wechatName;
	}
	
	
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
	

}
