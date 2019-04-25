package objectCreationTasks;

public class House {
	
	String type;
	int numOfRooms;
	String address;
	
	public void info() {
		System.out.println("Type: " + this.type);
		System.out.println("Number of rooms: " + this.numOfRooms);
		System.out.println("Address: " + this.address);
	}

}
