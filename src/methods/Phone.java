package methods;

public class Phone {
	
	public static void main(String[] args) {
		boolean b = isWeatherSunny("Sunday");
		if(b) {
			System.out.println("Let's do picnic");
		}else {
			System.out.println("Let's code");
		}
	}
	
	public static boolean isWeatherSunny(String day) {
		if(day.equals("Monday")) {
			day = day.substring(3);
			return true; // terminates the method
		}
		System.out.println(day + " is not sunny");
		return false;
	}

}
