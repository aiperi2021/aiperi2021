package arrays;

import java.util.Arrays;
import java.util.Random;

public class DataBase {

	public static void main(String[] args) {
		int [] ages = new int[50];
		Random r = new Random();
		
		int ii = 0;
		while(true) {
			ages[ii] = r.nextInt(100);
			if(ii == 49) {
				break;
			}
			ii++;
		}
		
//		ages[0] = ?;
//		ages[1] = ?;
//		ages[2] = ?;
//		ages[3] = ?;
		System.out.println(Arrays.toString(ages));
	}
}






