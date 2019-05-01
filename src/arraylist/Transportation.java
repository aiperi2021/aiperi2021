package arraylist;

import java.util.ArrayList;

public class Transportation {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names.size());
		names.add("Adam");
		names.add("James");
		System.out.println(names);
		System.out.println(names.size());
		names.add(0, "Jennifer");
		System.out.println(names);
		System.out.println(names.get(1));
		String s = "Adam";
		String s2 = names.get(1);
		System.out.println(names.contains("Adam"));
		System.out.println(names.indexOf("john"));
		names.remove("James");
		names.remove(0);
		System.out.println(names);
		names.add("James");
		names.add("James");
		System.out.println(names);
		System.out.println(names.indexOf("James"));
		names.remove("James");
		System.out.println(names);
		names.remove("James");
		System.out.println(names);
		System.out.println(names.isEmpty());
		names.clear();
		System.out.println(names);
	}

}
