package nestedloop;

public class MyNested {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 40; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
//		System.out.println("Second one");
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
		
	}

}
