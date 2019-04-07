package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class FancyCars {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cars you have:");
		int numOfCars = input.nextInt();
		input.nextLine();
		String [] myGarage = new String[numOfCars];
		System.out.println(Arrays.toString(myGarage));
		
		for(int i = 0; i < numOfCars; i++) {
			System.out.println("Please enter car " + (i+1) + ":");
			String carName = input.nextLine();
			myGarage[i] = carName;
		}
		System.out.println(Arrays.toString(myGarage));
		// Part V
		// Iterate through each car
		int counter = 0;
		for(int k = 0; k < myGarage.length; k++) {
			if(myGarage[k].equalsIgnoreCase("bmw") || myGarage[k].equalsIgnoreCase("mercedes")) {
				System.out.println("You have German car!");
				counter++;
				break;
			}
		}
		if(counter == 0) {
			System.out.println("You don't have German car!");
		}
		
	}

}







