package TGM_4;

import java.util.Scanner;

public class TGMExample1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Say� gir=> ");
		int number = input.nextInt();

		boolean prime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime)
			System.out.println("Say� asal");
		else
			System.out.println("Say� asal de�il");

	}

}
