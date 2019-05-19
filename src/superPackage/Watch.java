package superPackage;

public class Watch {

	static String result = "";
	static {
		result += "c";
	}
	static {
		result += "u";
	}
	static {
		result += "b";
	}
	{
		result += "r";
	}

	public static void main(String[] args) {
		
		new Watch();
		System.out.print(Watch.result + " ");
	}

}
