package TGM_3;

import java.util.Scanner;

public class TGMExample3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int total = 0;
		
		System.out.println("Bir say� gir=> ");
		int number = input.nextInt();

		while (number != 0) {
			total += number;
			System.out.println("Bir say� gir=> ");
			number = input.nextInt();
		}

		System.out.println(total);

	}

}
