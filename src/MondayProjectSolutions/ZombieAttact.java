package MondayProjectSolutions;

import java.util.Arrays;

public class ZombieAttact {

	public static void main(String[] args) {

		//zombieAttact1();
		zombieAttact2();

	}


	public static void zombieAttact1() {

		// Your code here 
		//--------------------------------------------------------------
		int[] inhabitants = {3, 6, 0, 4, 7, 1, 3, 2};

		// inhabitants[index] -> value // get value
		// inhabitants[index] = 6;
		// use sum in order to know how many people left
		// use counter in order to count days

		int day =0;
		int sum = 0;

		System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

		do {
			day++;
			sum=0;
			for(int i=0; i<inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i]/2;
				sum = sum +inhabitants[i]; // 
			}
			System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

		}while(sum!=0);

	}





	public static void zombieAttact2() {

		int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
		int [] copyInhabitants = Arrays.copyOf(inhabitants, inhabitants.length);

		int day =0;
		int sum =0;

		System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

		do {

			day++;
			sum =0;
			// 0, 6, 0, 4, 0, 1, 3, 0 => original

			// 1, 3, 0, 2, 0, 0, 1, 0 => day1
			
			// you are updating original one => second for loop
			
			// 1, 3, 0, 2, 0, 0, 1, 0 => original
			
			// 1, 1, 0, 1, 0, 0, 0, 0 => day2
			
			// 1, 1, 0, 1, 0, 0, 0, 0 => original
			
			// 1, 1, 0, 1, 0, 0, 0, 0 => day3

			for(int i=0; i<inhabitants.length; i++) {

				if(i!=0&&i!=inhabitants.length-1&& inhabitants[i]==0) {
					copyInhabitants[i-1] =inhabitants[i-1]/2;
					copyInhabitants[i+1] =inhabitants[i+1]/2;
				} else if( i==inhabitants.length-1 && inhabitants[i]==0) {
					copyInhabitants[i-1] =inhabitants[i-1]/2;
				} else if(i==0&&inhabitants[i]==0) {
					copyInhabitants[i+1] =inhabitants[i+1]/2;
				}

			}

			for(int i=0; i<inhabitants.length; i++) {

				inhabitants[i]=copyInhabitants[i];
				sum+=inhabitants[i];
			}

			System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
			

		}while(sum!=0);





	}



}
