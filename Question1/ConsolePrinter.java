package q1;

public class ConsolePrinter extends Printer {

	
	@Override
	public void printOut(Printable printable) {
		System.out.println("Data is printed to console: ");
		System.out.println(printable.getContent());
		
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
