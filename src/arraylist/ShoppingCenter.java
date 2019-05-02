package arraylist;

import constructors.Item;

public class ShoppingCenter {
	
	public static void main(String[] args) {
		Store channel = new Store("Good Vibes", "Chicago, IL");
//		channel.seeInventory();
		Item screen = new Item("Screen ABG", 35);
		Item tire = new Item("Good Rich", 299);
		channel.addItem(screen);
		channel.addItem(tire);
//		channel.seeInventory();
		channel.checkItem("Lip sticks");
		channel.checkItem("Good Rich");
		Item board = new Item("White Board", 90);
		System.out.println(channel.totalSales);
		channel.exchange(board, tire);
		System.out.println(channel.totalSales);
		channel.seeInventory();
		
	}

}
