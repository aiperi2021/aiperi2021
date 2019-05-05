package utilities;

import java.util.ArrayList;
import constructors.DebitCard;

public class ListTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = MyCollection.getStringList();
		System.out.println(list);
//		System.out.println(MyCollection.filterList(list, 3));
		System.out.println(MyCollection.removeDuplicates(list));
		DebitCard dc = new DebitCard();
		dc.holderName = "James";
	}

}
