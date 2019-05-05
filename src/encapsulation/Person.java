package encapsulation;

public class Person {
	
	private String name;
	private String gender;
	private int age;
	private double weight;
	private double height;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
			this.gender = gender;
		}else {
			System.out.println("Invalid Gender");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 0 && age <= 120) {
			this.age = age;
		}
		else {
			System.out.println("Invalid Age");
		}
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight > 0) {
			this.weight = weight;
		}else {
			System.out.println("Invalid weight");
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height > 0) {
			this.height = height;
		}else {
			System.out.println("Invalid Height");
		}
	}
	
	public void info() {
		System.out.println("\nPerson Information");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
		System.out.println("Weight: " + this.weight);
		System.out.println("Height: " + this.height);
	}
	
	public static void getHaircut(Person person) {
		if(person.gender.equalsIgnoreCase("male")) {
			System.out.println(person.name + " is getting haircut at Men's Barbershop");
		}
		else if(person.gender.equalsIgnoreCase("female")) {
			System.out.println(person.name + " is getting haircut at Women's Hair Salon");
		}
		else {
			System.out.println("Not able to get haircut");
		}
	}
	
	public static void getMarried(Person p1, Person p2) {
		if(p1.age >= 18 && p2.age >= 18) {
			if(p1.gender.equalsIgnoreCase("male") && p2.gender.equalsIgnoreCase("female")) {
				System.out.println("Valid Marriage");
			}
			else if(p1.gender.equalsIgnoreCase("female") && p2.gender.equalsIgnoreCase("male")) {
				System.out.println("Valid Marriage");
			}
			else {
				System.out.println("Invalid Marraige");
			}
		}
		else {
			System.out.println("Too young to get married");
		}
	}
	

}
