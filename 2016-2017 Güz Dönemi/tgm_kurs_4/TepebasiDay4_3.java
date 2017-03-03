package tgm_kurs_4;

import java.util.Scanner;

public class TepebasiDay4_3 {

	public static void main (String[] args) {
		
		// Fibonacci dizisi için örnek
		// Konsola girilen sayı kadar
		// diziyi ekrana bastırmaya yarar

		Scanner scan = new Scanner(System.in);

		long sum = 0, prev1 = 1, prev2 = 1, limit;

		System.out.println("Kaç tane sayı olsun=> ");
		limit = scan.nextInt();

		System.out.print(prev1 + " ");
		System.out.print(prev2 + " ");

		for (int i = 0; i < limit - 2; i++) {
			sum = prev1 + prev2;
			System.out.print(sum + " ");
			if (i % 10 == 0 && i != 0) System.out.println();
			prev1 = prev2;
			prev2 = sum;
		}

	}

}
