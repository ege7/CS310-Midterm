package q1;

public class FilePrinter extends Printer {
	
	private String fileName;

	public FilePrinter(String fileName) {
		this.fileName = fileName;
	}

	@Override
	void printOut(Printable printable) {
		System.out.println("Data printed to file:" + fileName + " : ");
		System.out.println(printable.getContent());
		
	}




	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return null;
	}



	
}
