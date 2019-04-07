package nestedloop;

import java.util.Random;

public class AI {

	public static void main(String[] args) {
		Random random = new Random();
		int target = random.nextInt(100);
		int attempts = 0;
		for(int i = 0; i < 100; i++) {
			attempts++;
			if(i == target) {
				System.out.println("Number is found");
				System.out.println("Number of attemps: " + attempts);
				System.out.println("Target: " + target);
				break;
			}
		}
	}
}




