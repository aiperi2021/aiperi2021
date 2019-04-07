package arrays;

import java.util.Scanner;

public class SoccerPlayers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] players = {"James", "John", "Adam", "Jamie", "Benzema"};
		int size = players.length;
		System.out.println("Please enter the keyword:");
		String keyword = input.next();
		for(int i = 0; i < size; i++) {
			String player = players[i];
			if(player.contains(keyword)) {
				System.out.println(player);
			}
		}
	}

}
