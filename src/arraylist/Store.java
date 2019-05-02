package arraylist;

import java.util.ArrayList;

import constructors.Item;

public class Store {
	
	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numOfItems;
	double totalSales;
	
	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void exchange(Item toReturn, Item toGet) {
		System.out.println(toReturn.name + " is exchanged with " + toGet.name);
		storeItems.add(toReturn);
		storeItems.remove(toGet);
		totalSales += toGet.price - toReturn.price;
	}
	
	public boolean checkItem(String itemName) {
		for(Item item: storeItems) {
			if(item.name.equals(itemName)) {
				System.out.println(itemName + " found in stock");
				return true;
			}
		}
		System.out.println(itemName + " is not found in stock");
		return false;
	}
	
	public void refund(Item item) {
		System.out.println("Refund transaction completed for " + item.name);
		addItem(item);
		totalSales -= item.price;
	}
	
	public void sell(String itemName) {
//		for(Item item: storeItems) {
//			if(item.name.equals(itemName)) {
//				System.out.println(itemName + " is sold for " + item.price);
//				numOfItems--;
//				totalSales += item.price;
//				storeItems.remove(item);
//				break; 
//			}
//		}
		for(int i = 0; i < storeItems.size(); i++) {
			if(storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " is sold for " + storeItems.get(i).price);
				numOfItems--;
				totalSales += storeItems.get(i).price;
				storeItems.remove(i);
				break;
			}
		}
	}
	
	
	
	public void addItem(Item item) {
		storeItems.add(item);
		numOfItems++;
	}
	
//	[ele1, ele2, ]
	
	public void seeInventory() {
		System.out.println("\nOur inventory list");
		// Using traditional for loop
//		for(int i = 0; i < storeItems.size(); i++) {
//			storeItems.get(i).info();
//		}
		// Using foreach loop
		for(Item i: storeItems) {
			i.info();
		}
	}

}





