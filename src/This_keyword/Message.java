package This_keyword;

public class Message {

	private String body;
	private String sender;
	private String receiver;

	// constructor
	public Message(String body, String sender, String receiver) {
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
	}

	// overload constructor
	public Message(String body) {
		this.body = body;
		this.sender = "Unknown";
		this.receiver = "Unknown";
	}
	public Message(String sender , String receiver) {
		this.body = "Unknown";
		this.sender =sender;
		this.receiver = receiver;
	}
	
	
	
	
	
	public Message() {
		System.out.println("This is non-args constructor");
	}

	// setter
	public void setBody(String body, String sender, String receiver) {
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
	}

	// getters
	public String getBody() {
		return body;
	}

	public String getSender() {
		return sender;
	}

	public String getReceiver(String receiver) {
		return receiver;
	}

}
