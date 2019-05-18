package superPackage;

public class Japan extends Country {
	
	public Japan() {
		System.out.println("hey guys");
		super("Whatever");
	}
	
	
	public void sakura() {
		System.out.println("Sakura method");
	}
	
	@Override
	public void anthem() {
		System.out.println("Some extra prints");
		super.anthem();
	}
	
	public static void main(String[] args) {
		Japan j = new Japan();
	}
	
	
	
}







