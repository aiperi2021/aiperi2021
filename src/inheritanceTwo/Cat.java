package inheritanceTwo;

import inheritance.Animal;
import inheritance.Dog;

public class Cat extends Animal {
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.gender = "male";
//		c.color = "red";
		Dog d = new Dog();
		
	}
}
