package inheritance;

public class Dog extends Animal{
	
	int color;
	
	public static void animalStatic() {
		System.out.println("Static method in Dog class");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	@Override
	protected Dog getMother() {
		Dog d = new Dog();
		return d;
	}
}





