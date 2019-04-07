package foreachloop;

public class Emails {
	
	public static void main(String[] args) {
		String [] emails = {"jb@gmail.com", "ab@c.com", "hello.com", "a@b.com"};
		for(String email: emails) {
			if(email.contains("@") && email.contains(".")) {
				System.out.println(email);
			}
		}
	}

}
