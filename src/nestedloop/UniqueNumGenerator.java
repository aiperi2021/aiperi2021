package nestedloop;

import java.util.Random;

public class UniqueNumGenerator {
	
	public static void main(String[] args) {
		Random r = new Random();
		String result = "";
		
		for(int i = 0; i < 9; i++) {
			int ii = r.nextInt(10);
			// While result contains the ii keep generating new ii.
			while(result.contains(ii+"")) {
				ii = r.nextInt(10);
				
			}
			result+=ii;
		}
		
		System.out.println(result);
	}

}
