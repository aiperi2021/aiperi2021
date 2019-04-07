package arrays;

public class ColorfulLife {

	public static void main(String[] args) {
		String [] colors = {"Grey", "Red", "Yellow", "Blue"};
		int size = colors.length;
		for(int i = 0; i < size; i++) {
			if(colors[i].length() >= 4) {
				System.out.println(colors[i]);
			}
		}
	}
}
