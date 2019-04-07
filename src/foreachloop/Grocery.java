package foreachloop;

public class Grocery {
	
	public static void main(String[] args) {
		String [] groceries = {"Apples", "bread", "cakes", "Cookies", "milk"};
		int counter = 0;
		for(String grocery: groceries) {
			char c = grocery.charAt(0);
			int i = c;
			if(i >= 65 && i <= 90) {
				counter++;
			}
		}
		System.out.println("There are " + counter + " words with upper case out of " + groceries.length + " words.");
	}

}
