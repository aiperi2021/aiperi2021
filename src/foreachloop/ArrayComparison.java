package foreachloop;

public class ArrayComparison {
	
	public static void main(String[] args) {
		String [] phones = {"Iphone", "Samsung", "LG", "Nokia"};
		String [] phones2 = {"Nokia", "Iphone"};
		int counter = 0;
		
		if(phones.length == phones2.length) {
			
			for(int i = 0; i < phones.length; i++) {
				String p = phones[i];
				String p2 = phones2[i];
				if(p.equals(p2)) {
					counter++;
				}
			}
		}
		
		if(counter == phones.length) {
			System.out.println("Arrays are same");
		}else {
			System.out.println("Arrays are different");
		}
		
		
	}

}
