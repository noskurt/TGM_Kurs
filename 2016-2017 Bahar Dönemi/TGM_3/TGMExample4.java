package TGM_3;

import java.util.Scanner;

public class TGMExample4 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		int number = 10;
		int guess;
		
		do {
			System.out.println("Bir sayý gir=> ");
			guess = input.nextInt();
		} while (number != guess);
		
		System.out.println("Doðru");

	}

}
