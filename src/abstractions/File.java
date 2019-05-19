package abstractions;

public abstract class File {

	String name;
	int count;
	
	public void close() {
		System.out.println("File is closing");
	}
	
	public abstract void open();
	
}
