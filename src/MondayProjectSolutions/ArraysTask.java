package MondayProjectSolutions;

import java.util.Scanner;

public class ArraysTask {

	public static void main(String[] args) {
		/**
		 * counter
		 * placeHolder
		 * nested for loop 
		 * user input scanner
		 * if else statement
		 * 
		 * */

		// Task 1
		Scanner input = new Scanner(System.in);

		System.out.println("Enter word:");
		String str = input.next().toLowerCase();

		int counter=0;
		String placeHolder="";

		// apple
		for(int i=0; i<str.length(); i++) {
			counter =0;
			char letter = str.charAt(i);
			
			if(!placeHolder.contains(letter+"")) {
				for(int j=0; j<str.length(); j++) {

					//letter -> a
					if(letter ==str.charAt(j)) {
						counter++;
					}
				}
				System.out.print(letter+":"+counter+" ");
				placeHolder+=letter+"";
			}
			
		}
		
		
		/**
		 * Use while
		 * if else statment
		 * 
		 * */


		int gift =100;
		int numberOfItems=0;
		
		while(gift>0 && numberOfItems<3) {
			
			System.out.println("Enter cost of item:");
			int price = input.nextInt();
			gift-=price;
			numberOfItems++;
			
			if(gift>0&& numberOfItems<3) {
				System.out.println("You spent $"+(100-gift)+" so far");
				System.out.println("You may buy up to "+(3-numberOfItems));
			}
			
			if(gift<0) {
				System.out.println("You can't spend more than $100 ");
				numberOfItems--;
				gift+=price;
			}
			
		}
		System.out.println("You bought "+numberOfItems+" items, spent $"+(100-gift)+" and done shopping");


		int count=0;
		
		int [] array = {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
		
		for(int i=0; i< array.length; i++) {
			count=0;
			for(int j=0; j<array.length; j++) {
				if(array[i]==array[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(array[i]+" ");
			}
		}
		// asdfadfadfadfdfefda
		
		String s = "apple"; // s.length-1-i => e
		boolean b =false;
		for(int i=0; i<s.length()/2; i++) {
			
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println("Not polindrom");
		}else {
			System.out.println("Polindrom");
		}
		
		
		











	}

}
