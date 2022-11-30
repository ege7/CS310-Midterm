package q1;
import java.time.LocalDateTime;
public class MainRunner {

	public static void main(String[] args) {
		
		LocalDateTime currentTime = LocalDateTime.now();
		Report report = new Report("Final Exam", "I am trying to complete the question, yeah still!", currentTime);
		SpreadSheet spreadsheet = new SpreadSheet("Budget", 10, 10);
		Letter letter = new Letter("Jack", "Henry", "Letter Content");
		
		
		
		FilePrinter filePrinter = new FilePrinter("output1.txt");
		
		filePrinter.addDocument(report);
		
		filePrinter.addDocument(spreadsheet);
		
		filePrinter.addDocument(letter);
		
		ConsolePrinter consolePrinter = new ConsolePrinter();
		
		consolePrinter.addDocument(report);
		
		consolePrinter.addDocument(spreadsheet);
		
		consolePrinter.addDocument(letter);
		
		
		
		
		filePrinter.printAllDocuments();
		
		consolePrinter.printAllDocuments();
		
		
		
	}

}	
