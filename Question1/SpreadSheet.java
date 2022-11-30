package q1;

public class SpreadSheet implements Printable {
	private String subject;
	private int numberOfColumns;
	private int numberOfRows;
	
	@Override
	public String getContent() {
		return "SpreadSheet [subject=" + this.subject + ", numberOfColumns=" + this.numberOfColumns + ", numberOfRows=" + this.numberOfRows + "]";
	}
	
	public SpreadSheet(String subject, int numberOfColumns, int numberOfRows) {
		this.subject = subject;
		this.numberOfColumns = numberOfColumns;
		this.numberOfRows = numberOfRows;
	
	}
	
}
