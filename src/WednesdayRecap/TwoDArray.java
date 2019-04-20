package WednesdayRecap;

import java.util.*;

public class TwoDArray {

	

	public static void main(String[] args) {
		getNumber();
	}
	
	public static void getNumber() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Inside i");
			System.out.println("i = "+i);

			for (int j = 0; j < 3; j++) {
				System.out.println("Inside j");

				System.out.println("i = "+i);
				System.out.println("j = "+j);
				for (int k = 0; k < 4; k++) {
					System.out.println("Inside k");

					System.out.println("i = "+i);
					System.out.println("j = "+j);
					System.out.println("k = "+k);
				}
			}
		}
}
}
