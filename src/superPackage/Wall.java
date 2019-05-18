package superPackage;

public class Wall {
	
	final String color;
	String material;
	
	public Wall() {
		this.color = "Yellow";
	}
	
	public Wall(String material) {
		this.material = material;
		this.color = "Blue";
	}
	
	public static void main(String[] args) {
		Wall w = new Wall("Glass");
		System.out.println(w.color);
		System.out.println(w.material);
	}
	
	// Rule for final: You can have instance variable as final
	// You must give a value if your instance variable is final
	// Or you can just declare BUT you MUST initialize through constructor
	

}
