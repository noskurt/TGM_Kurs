package tgm_kurs_4;

import java.util.Scanner;

public class TepebasiDay4 {

	public static void main (String[] args) {
		String yazi = "Tepebaşı";
		print();
		printText(yazi, 5);

		int newNumber = show();
		System.out.println(newNumber);

		int total = toplam(6, 10);
		System.out.println(total);
	}
	
	// Parametresiz void bir method
	public static void print () {
		System.out.println("Hello");
	}
	
	// Parametreli void bir method
	public static void printText (String text, int no) {
		System.out.println(text);
		System.out.println(no + 5);
	}
	// Parametresiz int bir method
	public static int show () {
		int no = 10;
		no *= 10;
		return no;
	}
	
	// Parametreli int bir method
	public static int toplam (int no1, int no2) {
		return no1 + no2;
	}

}