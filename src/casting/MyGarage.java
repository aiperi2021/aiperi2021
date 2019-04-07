package casting;

public class MyGarage {
	
	public static void main(String[] args) {
		String garage ="Toyota, Jaguar, Mazerati, Ford";
		garage = garage.toLowerCase();
		System.out.println(garage);
		if(garage.isEmpty()) {
			System.out.println("There are no cars");
		}else {
			if(garage.contains("toyota") || garage.contains("nissan")) {
				System.out.println("There are Japanese cars");
			}else {
				System.out.println("No Japanese cars");
			}
			if(garage.contains("bmw")) {
				System.out.println("There are German cars");
			}else {
				System.out.println("No German cars");
			}
			if(garage.contains("mazerati")) {
				System.out.println("There are Italian cars");
			}else {
				System.out.println("No Italian cars");
			}
			if(garage.contains("jaguar")) {
				System.out.println("There are British cars");
			}else {
				System.out.println("No British cars");
			}
		}
	}

}
