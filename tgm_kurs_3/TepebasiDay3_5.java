package tgm_kurs_3;

import java.util.Scanner;

public class TepebasiDay3_5 {

	public static void main (String[] args) {

		// Asal sayı tespiti yapan bir program
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı gir=> ");
		int number = input.nextInt();

		boolean prime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime) System.out.println("Asal");
		else System.out.println("Asal değil");

	}

}
