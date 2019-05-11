package WednesdayRecap;

import java.util.ArrayList;

public class ArrayListRecap {

	public static void main(String[] args) {
		ArrayList<String> animalList = new ArrayList<>();
		ArrayList<String> zoo = new ArrayList<>();
		
		String dog = "Dog";

		animalList.add("Monkey");
		animalList.add("Elephant");
		animalList.add("Fox");
		animalList.add("Tiger");
		animalList.add("Lion");
		
		animalList.add(dog);
		animals(animalList);
		zoo.addAll(animalList);
	}

	public static void animals(ArrayList<String> animalList) {

		for (int i = 0; i < animalList.size() - 1; i++) {
			String value = animalList.get(i);
			if (value.equals("Tiger") && animalList.get(i + 1).equals("Lion")) {
				animalList.add(i + 1, "Wolf");
			}
		}
		System.out.println(animalList);
	}

}
