package tgm_kurs_3;

import java.util.Scanner;

public class TepebasiDay3 {

	public static void main (String[] args) {

		// BMI hesabı yaptıran bir program
		Scanner scan = new Scanner(System.in);

		System.out.println("Kilonu gir(kg)=> ");
		int kilo = scan.nextInt();

		System.out.println("Boyunu gir(m)=> ");
		double boy = scan.nextDouble();

		double sum = kilo / (boy * boy);

		System.out.println(sum);

		// Hesaplanan sonuca göre if else
		// komutlarıyla yorum yaptık
		if (sum < 18.5) System.out.println("Zayıfsın");
		else if (sum >= 18.5 && sum < 25) System.out.println("Normal");
		else if (sum >= 25 && sum < 30) System.out.println("Kilolu");
		else System.out.println("Obez");

	}

}