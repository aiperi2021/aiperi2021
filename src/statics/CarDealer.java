package statics;

import java.util.ArrayList;

import utilities.MyCollection;

public class CarDealer {
	
	public static void main(String[] args) {
//		System.out.println(Lexus.totalLexus);
		Lexus l1 = new Lexus("ES 350", 2009);
//		System.out.println(Lexus.totalLexus);
//		System.out.println(Lexus.mileToKm(13));
//		System.out.println(l1.mileage);
//		l1.mileage = 100000;
//		Lexus.evaluateCar(l1);
		ArrayList<String> myList = MyCollection.getStringList();
		System.out.println(myList);
	}

}
