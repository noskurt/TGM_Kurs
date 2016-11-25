package tgm_kurs_6;

import java.util.Scanner;

public class TepebasiDay6 {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Sayı gir=> ");
		int size = scan.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.print(randomChar('0', '9'));
		}

	}
	
	// Bu method belirlediğimiz karakterler arasında
	// rasgele seçim yaparak o karakteri geri döndürüyor
	public static char randomChar (char c1, char c2) {
		return (char) (c1 + Math.random() * (c2 - c1 + 1));
	}

}
