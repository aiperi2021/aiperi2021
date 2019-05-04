package statics;

public class BestBuy {
	
	static int numOfcomputers;
	String location;
	static String day = "Saturday";
	// You can have actual day using java. 
	static {
		System.out.println("Second static block");
	}
	
	static {
		System.out.println("First static block");
		if(day.equals("Saturday")){
			numOfcomputers = 45;
		}else {
			numOfcomputers = 60;
		}
	}
	
	

	public void sellComputer() {
		System.out.println("Computer is sold");
		numOfcomputers--;
	}
	
}
