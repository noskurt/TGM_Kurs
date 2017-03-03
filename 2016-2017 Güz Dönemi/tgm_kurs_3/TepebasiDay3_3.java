package tgm_kurs_3;

import java.util.Scanner;

public class TepebasiDay3_3 {

	public static void main (String[] args) {
		
		// do-while için bir örnek

		Scanner scan = new Scanner(System.in);

		int data = 0;
		int sum = 0;

		do {
			sum += data;
			System.out.println("Sayı gir(EXIT=0)=> ");
			data = scan.nextInt();
		} while (data != 0);

		System.out.println("Sonuç=> " + sum);

	}

}
