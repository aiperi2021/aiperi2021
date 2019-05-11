package WednesdayRecap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import loops.RacistPerson;

public class Registration {
	
	Random random = new Random();
	
	String[] firstNames = {"Nick","Nicole","Joe","Luis","Brian"};
	int age = random.nextInt(40);
	
	public List<RegistrationForm> registerRandomStudents() {
		
		List<RegistrationForm> students = new ArrayList<>();
		
		for (int i = 0; i < firstNames.length; i++) {
			
		}
		
		return students;
		
	}


	public List<RegistrationForm> registerStudents() {

		List<RegistrationForm> registeredStudents = new ArrayList<>();

		RegistrationForm student1 = new RegistrationForm();
		RegistrationForm student2 = new RegistrationForm();
		RegistrationForm student3 = new RegistrationForm();
		RegistrationForm student4 = new RegistrationForm();
		RegistrationForm student5 = new RegistrationForm();

		student1.setFirstName("Nicole");
		student1.setLastName("Barger");
		student1.setAge(35);
		student1.setSSN(312456325);

		student2.setFirstName("Nuke");
		student2.setLastName("David");
		student2.setAge(31);
		student2.setSSN(312456325);
		
		student3.setFirstName("Cristiano");
		student3.setLastName("Ronaldo");
		student3.setAge(36);
		student3.setSSN(312456325);
		
		student4.setFirstName("Mario");
		student4.setLastName("Diaz");
		student4.setAge(38);
		student4.setSSN(312456325);

		student5.setFirstName("Luis");
		student5.setLastName("Joshua");
		student5.setAge(32);
		student5.setSSN(312456325);
		
		registeredStudents.add(student1);
		registeredStudents.add(student2);
		registeredStudents.add(student3);
		registeredStudents.add(student4);
		registeredStudents.add(student5);

		return registeredStudents;
	}
}
