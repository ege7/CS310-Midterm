package q2;

public class Book {
	private String title;
	private String foreWord;
	private Chapter[] chapters;
	
	public Book(String title, String foreword, Chapter[] chapters) {
		this.title = title;
		this.foreWord = foreword;
		this.chapters = chapters;
		
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getForeWord() {
		return foreWord;
	}

	public void setForeWord(String foreWord) {
		this.foreWord = foreWord;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

	public String getInfo() {
		
		int numberOfPages = this.getNumberOfPages();
		String text = "Book: title:" + this.title + ", foreWord:" + this.foreWord + "\nTotal number of pages:" + numberOfPages + "\n";
		for(int i = 0; i < chapters.length;i++) {
			String intro = chapters[i].getInfo();
			text+=intro + "\n";
		}
		
		return text;
	}
	
	
	public int getNumberOfPages() {
		int pages = 0;
		for(int i = 0; i < chapters.length;i++) {
			pages+= chapters[i].getPages().length;
		}
		return pages;
	}
	
	
	
}
