package TGM_3;

import java.util.Scanner;

public class TGMExample2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = 10;
		
		System.out.println("Bir say� gir=> ");
		int guess = input.nextInt();
		
		while (number != guess){
			System.out.println("Yanl��");
			System.out.println("Bir say� gir=> ");
			guess = input.nextInt();
		}
		
		System.out.println("Do�ru");
		
	}

}
