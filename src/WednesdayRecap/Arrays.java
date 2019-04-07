package WednesdayRecap;

public class Arrays {
	
	public static void method1() {
		String[] names = { "ada", "Dinara", "Asel", "Elvira", "Kurmanzhan", "Aigerim", "Cholpon", "Aida", "Mehmet",
				"Deniz" };
		int count=0;
		String firstTwoLetters="";
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("A")||names[i].startsWith("a")) {
				count++;
				 firstTwoLetters += names[i].substring(0, 2)+" ";
			}
		}
		System.out.printf("Count is : %s "
				+ "and first Two letters are : %s",
				count,firstTwoLetters);
	}
	

	public static void method2() {
		String[] names = { "ada", "Dinara", "Asel", "Elvira", "Kurmanzhan", "Aigerim", "Cholpon", "Aida", "Mehmet",
				"Deniz" };
		int count=0;
		String firstTwoLetters="";
	
		for(String name:names) {
			if(name.startsWith("A")||name.startsWith("a")) {
				count++;
				 firstTwoLetters += name.substring(0, 2)+" ";
			}
			System.out.println(name);
		}

		System.out.printf("Count is : %s "
				+ "and first Two letters are : %s",
				count,firstTwoLetters);
	}
}
