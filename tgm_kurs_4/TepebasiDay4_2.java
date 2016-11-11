package tgm_kurs_4;

import java.util.Scanner;

public class TepebasiDay4_2 {
	
	// Method Overloading
	// Aynı isimde methodlar oluşturduk
	// ancak bu methodların imzaları farklı
	// bu methodlardan hangisi girilen parametrelere
	// uygunsa o method çalışır
	
	public static void main (String[] args) {
		System.out.println(max(6, 19.0 / 2, 8));
	}

	public static int max (int no1, int no2, int no3) {
		System.out.println("int max");
		if (no1 > no2 && no1 > no3) return no1;
		else if (no2 > no1 && no2 > no3) return no2;
		else return no3;
	}

	public static double max (double no1, double no2) {
		if (no1 > no2) return no1;
		else return no2;
	}

	public static double max (double no1, double no2, double no3) {
		System.out.println("double max");
		if (no1 > no2 && no1 > no3) return no1;
		else if (no2 > no1 && no2 > no3) return no2;
		else return no3;
	}
}