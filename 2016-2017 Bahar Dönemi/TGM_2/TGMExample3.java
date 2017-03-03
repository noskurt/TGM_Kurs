package TGM_2;

import java.util.Scanner;

public class TGMExample3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int grade;

		System.out.println("Bir not gir(0-100)");
		grade = input.nextInt();

		if (grade <= 100 && grade >= 70) {
			System.out.println("AA");
		} else if (grade <= 69 && grade >= 50) {
			System.out.println("BB");
		} else if (grade <= 49 && grade >= 30) {
			System.out.println("CC");
		} else {
			System.out.println("FF");
		}

	}
}