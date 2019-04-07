package stringmanipulation;

public class CheckAccount {
	
	public static void main(String[] args) {
		String s = "Account Number: 453453";
		// Check if "number" is starting with upper case or lower case
		// print "Starts with upper case" if "Number"
		// print "Starts with lower case" if "number"
		// NOTE: USE charAt, indexOf
		
		int nIndex = s.indexOf(" ") + 1; // " 1"
		if(s.charAt(nIndex) == 'n') {
			System.out.println("Starts with lower case");
		}else {
			System.out.println("Starts with upper case");
		}
		
		
	}

}
