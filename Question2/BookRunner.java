package q2;

public class BookRunner {

	public static void main(String[] args) {
		Page page1 = new Page(1, "Page 1 Content ");
		Page page2 = new Page(2, "Page 2 Content ");
		Page page3 = new Page(1, "Page 1 Content ");
		Page page4 = new Page(2, "Page 2 Content ");
		
		Page[] pagesList = {page1,page2};
		Page[] pagesList2 = {page3, page4};
		Chapter chapter1 = new Chapter(1,"First Chapter",pagesList);
		Chapter chapter2 = new Chapter(1, "First Chapter", pagesList2);
		
		Chapter[] chapterList = {chapter1};
		Chapter[] chapterList2 = {chapter2};
		
		Book book1 = new Book("Grapes of Wrath", "Fore word of Grapes Of Wrath", chapterList);
		Book book2 = new Book("Introduction to Java" , "Fore word of Intro to Java", chapterList2);
		
		Book[] booksTotal = {book1,book2};
		BookShelf shelf = new BookShelf(booksTotal); //books is a List of type Book

		System.out.println(shelf.getInfo());

		Book pickUpBook = shelf.getBook(1);

		System.out.println("Pick up book:" + pickUpBook.getInfo());

	}

}
