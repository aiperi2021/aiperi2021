package arrays;

public class WindyCity {
	
	public static void main(String[] args) {
		String [] cities = {"Chicago", "New York", "Madison", "Miami", "Washington"};
		boolean check = false;
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].equals("Chicago")) {
				System.out.println("Windy City found");
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println("Windy city not found");
		}
		// Part II
		// Print line 26 only if there is at least 1 chicago
		int counter = 0;
		
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].equals("Chicago")) {
				counter++;
			}
		}
		if(counter > 0) {
			System.out.println("Number of Chicago: " + counter);
		}
	}
}





