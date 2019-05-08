package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Talk {

	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		Date date = new Date(); 
		String dateStr = dateFormat.format(date); 
		System.out.println(dateStr);
		
//		IPhone iphone = new IPhone();
//		iphone.setMemory(256);
//		iphone.info();
//		System.out.println(iphone.getMemory());
//		Person p1 = new Person();
//		p1.setName("James Bond");
//		p1.setAge(25);
//		p1.setGender("male");
//		p1.info();
//		Person.getHaircut(p1);
//		Person.getMarried(p1, p1);
//		Person p2 = new Person();
//		p2.setAge(21);
//		p2.setGender("female");
//		Person.getMarried(p1, p2);
		
		
	}
}





