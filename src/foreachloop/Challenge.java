package foreachloop;

import java.util.Random;

public class Challenge {
	
	public static void main(String[] args) throws InterruptedException {
		while(true) {
			int n = new Random().nextInt(10);
			for(int i = 0; i < n+30; i++) {
				int c = new Random().nextInt(60000);
				char cc = (char)c;
				Thread.sleep(12);
				if(c % 2 == 0){
					System.out.print(cc);
				}else {
					System.err.print(cc);
				}
			}
			System.out.println();
		}
	}

}
