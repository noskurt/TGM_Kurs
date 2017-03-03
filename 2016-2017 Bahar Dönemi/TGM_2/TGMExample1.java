package TGM_2;

import java.util.Scanner;

public class TGMExample1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Bir sayý gir");
		number = input.nextInt();
		
		if(number % 5 == 0){
			System.out.println("Sayý 5'e bölündü");
		}
		
		if(number % 2 == 0){
			System.out.println("Sayý 2'ye bölündü");
		}
		
		

	}

}
