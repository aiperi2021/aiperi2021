package inheritance;

public class Animal {

	private int age;
	protected String gender;
	String color;
	
	public static void animalStatic() {
		System.out.println("Static method in Animal class");
	}
	
	protected Animal getMother() {
		Animal a = new Animal();
		return a;
	}
	
	protected void eat() {
		System.out.println("Animal is eating");
	}
}









