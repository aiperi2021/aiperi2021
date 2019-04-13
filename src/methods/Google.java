package methods;

public class Google {
	
	public static void main(String[] args) {
		String result = "About 8,770,000 results (1.51 seconds)";
		String r = resultCount(result);
		System.out.println(r);
		String c = resultCount("About 2,330,000,000 results (0.86 seconds)");
		System.out.println(c);
		System.out.println(resultTime(result));
	}
	
	public static String resultTime(String res) {
		String r = res.substring(res.indexOf("(")+1, res.length()-1);
		return r;
	}
	
	public static String resultCount(String res) {
		String [] words = res.split(" ");
		String s = words[1];
		s = s.replace(",", "");
		return s;
	}
	
	

}
