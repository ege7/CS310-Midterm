package q1;
import java.time.LocalDateTime;
public class Report implements Printable {
	private String title;
	private LocalDateTime reportDate;
	private String text;
	
	public Report(String title, String text, LocalDateTime reportDate) {
		this.title = title;
		this.text = text;
		this.reportDate = reportDate;
		
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "Report [title=" + this.title + ", text=" + this.text + ", reportDate=" + this.reportDate + "]";
	}
	
}
