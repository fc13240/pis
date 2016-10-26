package zhuanli.domain;

public class Page {
	private int id;
	private int totalRecords;//
	private int currentPage;//
	private int pageSize = 20;//
	private int userId;
	private int pageSize = 10;//
	
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize <= 0) {
			throw new IllegalArgumentException("pageSize must be >= 0");
		}
		
		this.pageSize = pageSize;
	}
	
	public int getStartIndex() {
		return pageSize * (currentPage - 1);
	}
	
	public int getTotalPages() {
		return (int) Math.ceil(totalRecords / (double)pageSize);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
