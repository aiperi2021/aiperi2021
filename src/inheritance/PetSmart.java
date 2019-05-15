package inheritance;

public class PetSmart {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.color = 45;
		dog.gender = "male";
		dog.eat();
		dog.animalStatic();
		Dog.animalStatic();
		Animal.animalStatic();
		
	}

}
