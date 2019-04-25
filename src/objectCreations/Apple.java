package objectCreations;

public class Apple {
	// Instance variables
	// All below variables belong to an object. 
	int size;
	String type;
	String color;
	String taste;
	
	public void setValues(int size, String type, String color, String taste) {
		this.size = size;
		this.type = type;
		this.color = color;
		this.taste = taste;
	}
	
	// Print out the information if it has some values.
	// how to check if it is null. --> type == null
	public void info() {
		
		if(size != 0){
			System.out.println("Size: " + size);
		}
		if(type != null) {
			System.out.println("Type: " + type);
		}
		if(color != null) {
			System.out.println("Color: " + color);
		}
		if(taste != null) {
			System.out.println("Taste: " + taste);
		}
		
	}
	

}
