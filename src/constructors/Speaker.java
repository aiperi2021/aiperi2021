package constructors;

public class Speaker {
	
	String model;
	double weight;
	int year;
	
	
	public Speaker(String model) {
		this(model, 2000);
		System.out.println("constructor");
	}
	// this() --> it is current constructor. Speaker()
	public Speaker(String model, int year) {
		this.model = model;
		this.year = year;
		this.volumeUp();
	}
	
	public void volumeUp() {
		System.out.println(this.model + " is increasing the volume");
	}
	
	public void volumeDown() {
		System.out.println(model + " is decreasing the volume");
	}

}
