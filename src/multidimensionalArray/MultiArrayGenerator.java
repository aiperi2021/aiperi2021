package multidimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class MultiArrayGenerator {
	
	public static void main(String[] args) {
		int [] [] n = getMultiArray(2, 3);
		for(int [] i: n) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static int [][] getMultiArray(int size1, int size2){
		int [][] numbers = new int[size1][size2];
		Random r = new Random();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = r.nextInt(100);
			}
		}
		return numbers;
	}

}






