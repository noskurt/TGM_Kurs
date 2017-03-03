package tgm_kurs_3;

import java.util.Scanner;

public class TepebasiDay3_1 {

	public static void main (String[] args) {
		
		//While için basit bir örnek
		
		int i = 0;
		int sum = 0;
		while (i < 10000) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		System.out.println("-----------------------------------------");
		
		// Sayıyı tahmin etmeye çalışıyoruz
		// Doğru sonucu bulamadıkça program 
		// bize tekrar tekrar soruyor
		
		int number = 15;

		Scanner scan = new Scanner(System.in);

		System.out.println("Sayıyı tahmin et=> ");
		int guess = scan.nextInt();

		while (number != guess) {
			System.out.println("Sayıyı tahmin et=> ");
			guess = scan.nextInt();
		}

		System.out.println("Bravo");

	}
}