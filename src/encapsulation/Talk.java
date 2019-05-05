package encapsulation;

public class Talk {

	public static void main(String[] args) {
//		IPhone iphone = new IPhone();
//		iphone.setMemory(256);
//		iphone.info();
//		System.out.println(iphone.getMemory());
		Person p1 = new Person();
		p1.setName("James Bond");
		p1.setAge(25);
		p1.setGender("male");
		p1.info();
		Person.getHaircut(p1);
		Person.getMarried(p1, p1);
		Person p2 = new Person();
		p2.setAge(21);
		p2.setGender("female");
		Person.getMarried(p1, p2);
		
	}
}





