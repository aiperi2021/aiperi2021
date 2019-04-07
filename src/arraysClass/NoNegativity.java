package arraysClass;

import java.util.Arrays;

public class NoNegativity {
	
	public static void main(String[] args) {
		int numbers [] = {1,2,-3,4,-34,55,78,90,33,10};
		System.out.println(Arrays.toString(numbers));
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] < 0) {
//				numbers[i] = 0;
//			}
//		}
		int ii = 0;
		for(int num: numbers) {
			if(num < 0) {
				numbers[ii] = 0;
				
			}
			ii++;
		}
		System.out.println(Arrays.toString(numbers));
		String s = Arrays.toString(numbers);
		String name = "James";
		s = s.replace(",", "!");
		s = s.replace("[", "");
		s = s.replace("]", "");
		System.out.println(s);
		String [] names = new String[23];
		
		
	}

}
