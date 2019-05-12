package inheritance;

public class Table extends Object{
	
	public static void main(String[] args) {
		Table t1 = new Table();
		Animal a = new Animal();
		Dog d = new Dog();
		// d.age = 34;
		// age is not inherited into Dog. Becuase it's private member
		d.eat();
		d.gender = "female";
		d.color = "Red";
	}

}
