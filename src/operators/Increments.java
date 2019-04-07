package operators;

public class Increments {

	public static void main(String[] args) {
		int size = 50;
		System.out.println(size++);
		System.out.println(size);
		size++; // size = size + 1;
		
		int age = 45;
		int otherAge;
		otherAge = age++; // 
		System.out.println(otherAge);
		System.out.println(age);
		
		System.out.println(++age);
		int size2 = age--;
		System.out.println(size2);
		System.out.println(age);
		
	}
}
