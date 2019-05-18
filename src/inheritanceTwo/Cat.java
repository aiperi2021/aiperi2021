package inheritanceTwo;

import inheritance.Animal;

public class Cat extends Animal {
	
	
	
	@Override
	protected void eat() {
		System.out.println("Cat is eating");
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		// If you create SpecificCat class and extend to Cat
		// which eat() method will it inherit?
		
//		c.color = "red";
//		Dog d = new Dog();
//		int [] nums = {34,5,65,5,2};
//		System.out.println(Arrays.toString(nums));
		
	}
}
