package q2;

public class Page  {
	private int no;
	private String content;
	
	public Page(int no, String content) {
		this.no = no;
		this.content = content;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getInfo() {
		return "Page: no:" + this.no + ", " + "content:Page " + this.no + " " + "Content" + "\n";
	}
}
