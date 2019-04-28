package constructors;

public class Phone {
	
	String model;
	boolean touchscreen;
	long phoneNumber;
	int memory;
	String color;
	
	public Phone(String model, String color) {
		this.color = color;
		this.model = model;
	}
	
	public Phone(String model, String color, int memory, boolean touchscreen) {
		this(model, color);
		this.touchscreen = touchscreen;
		if(memory > 0) {
			this.memory = memory;
		}else {
			System.out.println("Invalid memory");
		}
	}
	
	public boolean text(long phoneNum, String message) {
		String pn = phoneNum + "";
		if(pn.length() == 10 && !message.isEmpty()) {
			System.out.println(message + " sent to " + phoneNum);
			return true;
		}else {
			System.out.println("Invalid phone number or message");
			return false;
		}
	}
	
	public void call(long phoneNum) {
		String pn = phoneNum + "";
		if(pn.length() == 10) {
			System.out.println("Calling to " + phoneNum);
		}else {
			System.out.println("Invalid phone number");
		}
	}
	
	
	

}







