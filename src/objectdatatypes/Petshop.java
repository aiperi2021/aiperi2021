package objectdatatypes;

import java.util.Random;

public class Petshop {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		// Dog --> is class that holds all the rules for one Dog to have
		// dog1 --> is a representation of an actual object/dog.
		// instance --> same as object.
		// instantiate --> creating an object. 
		// Whenever we are using keyword 'new' we are instantiating an object.
		dog1.age = 3;
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		dog1.bark(); // simply calling the behavior method of Dog.
		Dog dog2 = new Dog();
		System.out.println(dog2.age);
	}
}



