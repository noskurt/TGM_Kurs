package TGM_2;

import java.util.Scanner;

public class TGMExample2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;

		System.out.println("Bir say� gir");
		number = input.nextInt();

		if (number < 0) {
			System.out.println("Say� negatif");
		}
		else if (number > 0){
			System.out.println("Say� pozitif");
		}
		else {
			System.out.println("Say� s�f�rd�r");
		}

	}
}