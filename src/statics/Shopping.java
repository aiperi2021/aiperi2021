package statics;

import java.util.*;
import static java.util.Arrays.*;
import static statics.BestBuy.*;

public class Shopping {

	public static void main(String[] args) {
		System.out.println(numOfcomputers);
		Random r = new Random();
		System.out.println(Lexus.mileToKm(43));
		
		BestBuy b1 = new BestBuy();
		b1.location = "Chicago Downtown";
		BestBuy b2 = new BestBuy();
		b2.location = "Des Plaines IL";
		BestBuy b3 = new BestBuy();
		b3.location = "Ohare Area";
		// How to access static fields/variables
		System.out.println(BestBuy.numOfcomputers);
	}
}
