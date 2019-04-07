package stringmanipulation;

public class AccountNumber {
	
	public static void main(String[] args) {
		
		// Account number can only start with 2 or 5
		
		
		String s = "Account number: 255572ACCD";
		
		
//		21
//		23
		int indexOfFirstDigit = s.indexOf(":") + 2;
		
		System.out.println(indexOfFirstDigit);
		
		if(s.charAt(indexOfFirstDigit) == '2') {
			System.out.println("Cool");
		}else {
			System.out.println("Not cool");
		}
		
		
		
	}

}
