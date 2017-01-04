package ideaStreet.domain;

import java.util.List;

public class FirstColumn {
	private int id;
	private String name;
	private List<SecondColumn> secondColumns;
	private List<Patent> Patents;
	private int firstCount;
	public int getId() {
		return id;
	}
	public int getFirstCount() {
		return firstCount;
	}
	public void setFirstCount(int firstCount) {
		this.firstCount = firstCount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SecondColumn> getSecondColumns() {
		return secondColumns;
	}
	public void setSecondColumns(List<SecondColumn> secondColumns) {
		this.secondColumns = secondColumns;
	}
	

}
