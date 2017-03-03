package TGM_2;

import java.util.Scanner;

public class TGMExample2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;

		System.out.println("Bir sayý gir");
		number = input.nextInt();

		if (number < 0) {
			System.out.println("Sayý negatif");
		}
		else if (number > 0){
			System.out.println("Sayý pozitif");
		}
		else {
			System.out.println("Sayý sýfýrdýr");
		}

	}
}