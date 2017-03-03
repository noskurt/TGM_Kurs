package TGM_2;

import java.util.Scanner;

public class TGMExample5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int month;

		System.out.println("Bir ay gir");
		month = input.nextInt();

		switch (month) {
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("Þubat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		default:
			System.out.println("HATA");
		}

		if (month == 1) {
			System.out.println("Ocak");
		} else if (month == 2) {
			System.out.println("Þubat");
		} else if (month == 3) {
			System.out.println("Mart");
		} else {
			System.out.println("HATA");
		}
	}
}