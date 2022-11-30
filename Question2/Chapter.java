package q2;

public class Chapter{
	private int no;
	private String title;
	private Page[] pages;
	
	public Chapter(int no, String title, Page[]pages) {
		this.no = no;
		this.title = title;
		this.pages = pages;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Page[] getPages() {
		return pages;
	}
	public void setPages(Page[] pages) {
		this.pages = pages;
	}
	
	public String getInfo() {
		String text = "Chapter: no: " + this.no + ", " + "title:" + this.title + "\n";
		for(int i = 0; i < pages.length;i++) {
			String intro = pages[i].getInfo();
			text+=intro;
		}
		
		return text;
		
		
	}
	
}
