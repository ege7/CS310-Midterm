package q1;

import java.util.ArrayList;

public abstract class Printer implements Printable{
	private ArrayList<Printable> docs = new ArrayList<Printable>();
	
	
	abstract void printOut(Printable printable);
	
	public void printAllDocuments() {
		for(int i = 0; i < docs.size();i++) {
			printOut(docs.get(i));
			
		}
	}
	
	public void addDocument(Printable printable) {
		docs.add(printable);
	}
	
	
}
