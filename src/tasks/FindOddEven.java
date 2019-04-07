package tasks;

import java.util.Random;

public class FindOddEven {

	public static void main(String[] args) {
		Random random = new Random();
		int randomValue = random.nextInt(100);
		System.out.println(randomValue);
		int remainder = randomValue % 2;
		if(remainder == 0) {
			System.out.println("Number is Even!");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
}
