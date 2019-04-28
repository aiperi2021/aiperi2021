package constructors;

public class FacebookUser {
	
	String username;
	String password;
	String name;
	int age;
	int numberOfFriends;
	
	public FacebookUser(String name, String username, String password) {
		this.name = name;
		this.username = username;
		if(password.contains(username)) {
			System.out.println("Password CANNOT contain username. Please change the password");
		}else {
			this.password = password;
		}
	}
	
	public FacebookUser(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public boolean sendFriendRequest(FacebookUser user) {
		if(user.numberOfFriends < 5000) {
			System.out.println("Friend request sent to " + user.name);
			user.numberOfFriends ++;
			this.numberOfFriends ++;
			return true;
		}else {
			System.out.println(user.name + " can't accept friend requests!");
			return false;
		}
	}
	
	public void userInfo() {
		System.out.println("\nFACEBOOK USER INFORMATION");
		System.out.println("Name: " + this.name);
		System.out.println("Username: " + this.username);
		System.out.println("Age: " + this.age);
		System.out.println("Number of Friends: " + this.numberOfFriends);
	}
	

}
