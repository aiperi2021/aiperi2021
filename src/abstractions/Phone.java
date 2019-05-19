package abstractions;

public abstract class Phone {
	
	public Phone() {
		super();
	}
	// class Phone now can have abstract methods
	String model;
	int size;
	
	public void info() {
		System.out.println("Model: " + model);
		System.out.println("Size: " + size);
	}
	
	public abstract void call();
	
	public abstract void internetConnection();
	

}
