package immutableAndMutable;

public class SB {
	
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("James");
//		System.out.println(sb);
		// Methods
		// methods#1: append --> concatination
//		sb.append("Bond");
//		System.out.println(sb);
//		sb.append(7);
//		System.out.println(sb);
//		sb.deleteCharAt(0);
//		System.out.println(sb);
//		sb.delete(1, 3);
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
//		sb.insert(2, "HELLO");
//		System.out.println(sb);
//		System.out.println(sb.length());
//		sb.replace(0, 4, "What uup");
//		System.out.println(sb);
//		System.out.println(sb.length());
//		sb.delete(3, 45);
//		System.out.println(sb);
		
		String s1 = "James";
		String s2 = new String("James");
		System.out.println(s1.equals(s2));
		StringBuilder sb = new StringBuilder(s1);
		String s = sb.toString();
		System.out.println(s);
		
	}

}
