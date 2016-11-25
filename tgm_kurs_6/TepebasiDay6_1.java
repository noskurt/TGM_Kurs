package tgm_kurs_6;

import java.util.Scanner;

public class TepebasiDay6_1 {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// İkili bir dizi oluşturduk bu dizide
		// kilo ve boyu sırayla tuttuk
		// [Kilo][Boy]
		int[][] data = new int[5][2];

		for (int i = 0; i < 5; i++) {
			System.out.println("Öğrencinin boyunu ve kilosunu gir> ");
			for (int j = 0; j < 2; j++) {
				data[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(data[i][0] + " " + data[i][1]);
			}
		}

	}

}
