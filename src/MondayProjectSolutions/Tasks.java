package MondayProjectSolutions;

public class Tasks {

	public static void main(String[] args) {
		String result = reverseWordsOnly("Java is fun");
		System.out.println(result);
		
		displayPrimeNumbers(90);
		

	}

	public static void displayPrimeNumbers(int num) {
		// 0 - 20 
		for(int i=0; i<=num; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

	public static boolean isPrime(int num) {
		
		if(num<2) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

	public static String reverseWordsOnly(String sentence) {
		
		sentence = sentence.trim();
		// Java is fun
		String[] sen = sentence.split(" ");
		String result ="";
		for(int i=0; i<sen.length; i++) {
			String word = sen[i];
			String reversed = reverse(word);
			
			result+=reversed+" ";
			
		}
		return result.trim();
	}

	public static String reverse(String word) {
		word = word.trim();
		String result ="";
		for(int i=word.length()-1; i>=0; i--) {
			result+=word.charAt(i);
		}
		
		return result;
	}

}
