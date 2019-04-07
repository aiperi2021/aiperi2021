package casting;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		short s = 445;
		int age = s;
		String sss = String.valueOf(age);
		System.out.println(age);
		int size = age;
		System.out.println(size);
		byte b = (byte)size;
		System.out.println(b);
		byte b2 = (byte)s;
		double d = 45.6;
		int ss = (int)d;
		System.out.println(ss);
//		String str = "hi seconds";
//		double seconds = Double.valueOf(str);
//		System.out.println(seconds + 5); // 0.811
		String sec = "0.81";
		double dd = 0.81;
		System.out.println(dd + 5.0);
		String wall = "4652";
		double dl = Double.valueOf(wall);
		System.out.println(dl);
		int w = Integer.valueOf(wall);
		System.out.println(w);
		if(w < 5000) {
			System.out.println("Cool");
		}
		
		
		
	}

}





