package TGM_2;

import java.util.Scanner;

public class TGMExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Bir say� gir");
		number = input.nextInt();
		
		if(number % 5 == 0){
			System.out.println("Say� 5'e b�l�nd�");
		}
		
		if(number % 2 == 0){
			System.out.println("Say� 2'ye b�l�nd�");
		}
		
		

	}

}
