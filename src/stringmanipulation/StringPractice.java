package stringmanipulation;

public class StringPractice {

	public static void main(String[] args) {
		
		String text= "personalized 2019 planner |"
				+ " planner 2019 | custom planner |"
				+ " weekly planner | daily planner ||"
				+ " Favorite Story";
		
//		String result1 = text.replace("|", "");
		String result2 = text.replace("|", "");
		
		System.out.println("\n"+result2);
	}
		
//		method1();
//		method2();

	private static void method2() {
		String str1 = "$22.00";
		String str2 = "22";
		
		boolean check = str1.substring(1,3).equals(str2);
		
		if(check == true)
			System.out.println("Equals");
		else
			System.out.println("Not equals");
	}

	
	private static void method1() {
		String money = "$22.00";
		int anyName = 22;	
		double anyName2 = anyName;
		String money2 = money.substring(1);	
		if(money2.equals(anyName2+"")) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
	}

}
