package WednesdayRecap;

import java.util.List;

public class RegistrationTest {

	public static void main(String[] args) {

		Registration registration = new Registration();

		List<RegistrationForm> result = registration.registerStudents();

		for (RegistrationForm registrationForm : result) {
			System.out.println("First name :" + registrationForm.getFirstName());
		}
		
		System.out.println("\nFirst student information: "+result.get(0).toString());
		System.out.println("\nLast student information: "+result.get(result.size()-1).toString());
	}

}
