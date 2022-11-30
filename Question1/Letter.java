package q1;

public class Letter implements Printable {
	private String sender;
	private String receiver;
	private String textContent;
	@Override
	
	public String getContent() {
		return "Letter [sender=" + this.sender + ", receiver=" + this.receiver + ", textContent=" + this.textContent + "]";
	}
	
	public Letter(String sender, String receiver, String textContent) {
		this.sender = sender;
		this.receiver = receiver;
		this.textContent = textContent;
	}
	
	
}
