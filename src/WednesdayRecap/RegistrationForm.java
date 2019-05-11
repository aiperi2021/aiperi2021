package WednesdayRecap;

public class RegistrationForm {
	
	private String firstName;
	private String lastName;
	private int age;
	private int SSN;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int i) {
		SSN = i;
	}
	@Override
	public String toString() {
		return "\nfirstName=" + firstName + ", \nlastName=" + lastName + ", \nage=" + age + ", \nSSN=" + SSN;
	}
}
