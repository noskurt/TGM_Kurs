package TGM_3;

import java.util.Scanner;

public class TGMExample1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Kilo gir(kg)=> ");
		int kilo = input.nextInt();

		System.out.println("Boy gir(m)=> ");
		double boy = input.nextDouble();

		double bmi = kilo / (boy * boy);
		
		System.out.printf("%.2f\n", bmi);

		if (bmi <= 18.5) System.out.println("Zayýfsýn");
		else if (bmi > 18.5 && bmi <= 25) System.out.println("Normalsin");
		else if (bmi > 25 && bmi <= 30) System.out.println("Kilolusun");
		else System.out.println("Obezsin");
		

	}
}