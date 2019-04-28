package constructors;

public class SocialMedia {
	
	public static void main(String[] args) {
		FacebookUser fb1 = new FacebookUser("jb07", "Jb2019");
		fb1.name = "James Bond";
		FacebookUser fb2 = new FacebookUser("bilal", "AmIrite");
		fb2.age = 25;
		fb2.name = "Bilal";
		fb2.numberOfFriends = 4999;
		FacebookUser fb3 = new FacebookUser("John Wick", "jwick", "JW2019!");
		
		boolean check = fb1.sendFriendRequest(fb2);
		
		fb1.userInfo();
		fb2.userInfo();
	}

}







