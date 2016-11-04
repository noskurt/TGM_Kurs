package tgm_kurs_3;

import java.util.Scanner;

public class TepebasiDay3_2 {

	public static void main (String[] args) {
		
		// Programa 0 değeri girilene kadar toplama yapıyor

		Scanner scan = new Scanner(System.in);

		System.out.println("Sayı gir(EXIT=0)=> ");
		int data = scan.nextInt();

		int sum = 0;

		while (data != 0) {
			sum += data;
			System.out.println("Sayı gir(EXIT=0)=> ");
			data = scan.nextInt();
		}

		System.out.println("Sonuç=> " + sum);

	}

}
