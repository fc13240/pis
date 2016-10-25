package zhuanli.domain;



public class PatentSearchCondition {

	private String keyword;
	private Page page;
	
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		String keywordStr = keyword == null ? "" : keyword;
		
		return "&keyword=" + keywordStr;
	}
}
