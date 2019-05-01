package arraylist;

import java.util.ArrayList;

import constructors.Item;

public class Store {
	
	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numOfItems;
	
	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void addItem(Item item) {
		storeItems.add(item);
		numOfItems++;
	}
	
//	[ele1, ele2, ]
	
	public void seeInventory() {
		// Using traditional for loop
		for(int i = 0; i < storeItems.size(); i++) {
			storeItems.get(i).info();
		}
		// Using foreach loop
		for(Item i: storeItems) {
			i.info();
		}
	}

}





