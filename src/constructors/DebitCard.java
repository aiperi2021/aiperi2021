package constructors;

public class DebitCard {
	
	String holderName;
	String cardNumber;
	double balance;
	int pin;
	String type;
	
	public DebitCard(String holderName, String cardNum, double balance, int pin, String type) {
		this.holderName = holderName;
		this.balance = balance;
		if(cardNum.length() == 16) {
			this.cardNumber = cardNum;
		}else {
			System.out.println("Invalid Card number");
		}
		if(type.equalsIgnoreCase("mastercard") || type.equalsIgnoreCase("visa")) {
			this.type = type;
		}else {
			System.out.println("Invalid card type");
		}
		String pinStr = pin + "";
		if(pinStr.length() == 4) {
			this.pin = pin;
		}else {
			System.out.println("Invalid Pin");
		}
	}
	
	

	
	
}
