package stringmanipulation;

public class AccountLength {
	
	public static void main(String[] args) {
		String s = "Account Number: 45343563";
		// Write a code that validates account number length.
		// Each account length must be 8
		// print "Valid account length" if valid
		// print "Invalid account length" if invalid
		int fistIndex = s.indexOf(":") + 2;
		String accountNumber = s.substring(fistIndex);

		if(accountNumber.length() == 8) {
			System.out.println("Valid account number length");
		}else {
			System.out.println("Invalid account number length");
		}
		
	}

}
