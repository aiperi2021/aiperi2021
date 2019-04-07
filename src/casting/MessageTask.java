package casting;

public class MessageTask {
	
	public static void main(String[] args) {
		String fullMessage = "Sender:<Jack Ma>. From Number:[202-123-3456]. "
				+ "Message: {I love programing and problem solving}";
		
//		int senderStart = fullMessage.indexOf("<") + 1;
//		int senderEnd = fullMessage.indexOf(">");
		String sender = fullMessage.substring(fullMessage.indexOf("<") + 1, fullMessage.indexOf(">"));
		System.out.println(sender);
		
		int phoneStart = fullMessage.indexOf("[") + 1;
		int phoneEnd = fullMessage.indexOf("]");
		String phoneNumber = fullMessage.substring(phoneStart, phoneEnd);
		System.out.println(phoneNumber);
		
		int messageStart = fullMessage.indexOf("{") + 1;
		int messageEnd = fullMessage.indexOf("}");
		String message = fullMessage.substring(messageStart, messageEnd);
		System.out.println(message);
	}

}
