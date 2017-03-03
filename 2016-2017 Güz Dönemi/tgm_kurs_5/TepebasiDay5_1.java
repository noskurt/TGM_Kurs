package tgm_kurs_5;

import java.util.Scanner;

public class TepebasiDay5_1 {

	public static void main (String[] args) {

		// double tipinde bir dizi oluşturduk
		// 5 tane elemanı olan bu dizide
		// boy uzunluklarını tuttuk
		Scanner scan = new Scanner(System.in);
		double[] heigths = new double[5];

		System.out.println("Boyları giriniz=> ");

		for (int i = 0; i < heigths.length; i++)
			heigths[i] = scan.nextDouble();

		// Daha sonra bu değişkenlere tekrar erişerek
		// Genel ortalama hesabı yaptık
		double avg, sum = 0;

		for (int i = heigths.length - 1; i >= 0; i--)
			sum += heigths[i];

		avg = sum / heigths.length;

		System.out.printf("Ortalama boy %.2f", avg);

	}
}