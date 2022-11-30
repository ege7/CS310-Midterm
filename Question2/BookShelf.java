package q2;

public class BookShelf {
	private Book[] books;
	
	public BookShelf(Book[] books) {
		this.books = books;
	}
	
	public int getNumberOfBooks() {
		return books.length;
	}
	
	public Book getBook(int index) { // d
		return books[index];
	}
	public void setBook(Book[] books) { 
		this.books = books;
	}
	public String getInfo() {
		int numberOfBooks = this.getTotalNumberOfBooks();
		String text = "Bookshelf: \nTotal number of books:" + numberOfBooks + "\n";
		for(int i = 0; i < books.length; i++) {
			String intro = books[i].getInfo();
			text+=intro + "\n";
			
		}
		return text;
		
		
	}
	public Book pickUpBook(int index) {
		return books[index];
	}
	
	public int getTotalNumberOfBooks(){
		return books.length;
	}
}
