package WednesdayRecap;

public class Device {

	String name;
	String model;
	private double price;

	boolean isOn;

	public void turnOn() {
		isOn = true;
		System.out.println("Flower is On");
	}

	public void turnOff() {
		isOn = false;
		System.out.println("Flower is Off");
	}
}
