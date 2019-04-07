package casting;

public class YearChecking {
	
	public static void main(String[] args) {
		String s = "Published on Feb 12, 2022";
		int indexOfComma = s.indexOf(",") + 2;
		
		s = s.substring(indexOfComma);
		System.out.println(s);
		int year = Integer.valueOf(s);
		
		if(year <= 2019) {
			System.out.println("Valid year");
		}else {
			System.out.println("Invalid year");
		}
	}

}
