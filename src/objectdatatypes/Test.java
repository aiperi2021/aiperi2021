package objectdatatypes;

public class Test {
	
	public static void main(String[] args) {
		Watch watch1 = new Watch();
		watch1.brand = "Rolex";
		watch1.color = "Gold";
		
		Watch watch2 = new Watch();
		watch2.brand = "iWatch";
		watch2.price = 999.99;
		watch2.material = "Plastic";
		
		System.out.println(watch1.color);
		watch1.tick();
		watch2.tick();
		
	}

}
