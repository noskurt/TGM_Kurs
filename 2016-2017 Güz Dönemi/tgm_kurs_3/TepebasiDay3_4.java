package tgm_kurs_3;

import java.util.Scanner;

public class TepebasiDay3_4 {

	public static void main (String[] args) {
		
		// while ve for karşılaştırmak için bir örnek
		// iki kod parçası da aynı işi yapıyor
		Scanner input = new Scanner(System.in);

		System.out.println("Rakam gir=> ");
		int number = input.nextInt();

		for (int i = 1; number >= i; i++)
			System.out.println(i);

		int j = 1;
		while (number >= j) {
			System.out.println(j);
			j++;
		}

	}

}
