package abstractions;

public class IPhone extends Phone{
	
	public IPhone() {
		super();
	}

	@Override
	public void call() {
		System.out.println("Iphone is calling in a cool way");
	}
	
	@Override
	public void internetConnection() {
		System.out.println("IPhone is connected to Internet");
	}
}
