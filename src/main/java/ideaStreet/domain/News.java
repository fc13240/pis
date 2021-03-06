package ideaStreet.domain;

import java.sql.Timestamp;
import java.util.Date;


public class News {
	private int id;
	private NewsType newsType;
	private User user;
	private String keywords;
	private String author;
	private String title;
	private Timestamp createTime;
	private Date publishTime;
	private Date updateTime;
	private String source;
	private String content;
	private String newsAbstract;
	private String smallImgUrl;
	private int upVote;
	private int downVote;
	private int click;
	
	
	
	
	
	public News() {
	}
	public News(int id, NewsType newsType, User user, String keywords, String author, String title,
			Timestamp createTime, Date publishTime, Date updateTime, String source, String content, String newsAbstract,
			String smallImgUrl, int upVote, int downVote, int click) {
		this.id = id;
		this.newsType = newsType;
		this.user = user;
		this.keywords = keywords;
		this.author = author;
		this.title = title;
		this.createTime = createTime;
		this.publishTime = publishTime;
		this.updateTime = updateTime;
		this.source = source;
		this.content = content;
		this.newsAbstract = newsAbstract;
		this.smallImgUrl = smallImgUrl;
		this.upVote = upVote;
		this.downVote = downVote;
		this.click = click;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getUpVote() {
		return upVote;
	}
	public void setUpVote(int upVote) {
		this.upVote = upVote;
	}
	public int getDownVote() {
		return downVote;
	}
	public void setDownVote(int downVote) {
		this.downVote = downVote;
	}
	public String getSmallImgUrl() {
		return smallImgUrl;
	}
	public void setSmallImgUrl(String smallImgUrl) {
		this.smallImgUrl = smallImgUrl;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public NewsType getNewsType() {
		return newsType;
	}
	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNewsAbstract() {
		return newsAbstract;
	}
	public void setNewsAbstract(String newsAbstract) {
		this.newsAbstract = newsAbstract;
	}
	
	
}
