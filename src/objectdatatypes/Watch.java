package objectdatatypes;

public class Watch {
	// instance variables
	String brand;
	String style;
	String color;
	String material;
	double price;
	String type;
	
	// methods/behaviors of Watch
	public void tick() {
		System.out.println(brand + " is ticking");
	}
	public void showTime() {
		System.out.println("Watch is showing the time");
	}
	public void showDate() {
		System.out.println("Watch is showing the date");
	}
	

}
