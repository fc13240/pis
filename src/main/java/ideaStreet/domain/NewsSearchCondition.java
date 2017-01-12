package ideaStreet.domain;

public class NewsSearchCondition {
	private int userId;
	private String keyword;
	private Integer newsType;
	private Page page;
	
	
	
	public NewsSearchCondition() {
	}
	
	
	public NewsSearchCondition(int userId, String keyword, Integer newsType, Page page) {
		this.userId = userId;
		this.keyword = keyword;
		this.newsType = newsType;
		this.page = page;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getKeyword() {
		if (keyword != null) {
			return keyword.trim();
		}
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getNewsType() {
		return newsType;
	}
	public void setNewsType(Integer newsType) {
		this.newsType = newsType;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		String keywordStr = keyword == null ? "" : keyword.trim();
		String newsTypeStr = newsType == null ? "" : newsType.toString();
		return "keyword=" + keywordStr+ "&newsType=" + newsTypeStr;
	}
	
}
