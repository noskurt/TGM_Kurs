package TGM_1;
import java.util.Scanner;

public class TGMExample3 {

	public static void main(String[] args) {
		
		// Scanner veri girmeye yarar
		Scanner input = new Scanner(System.in);
		
		String name;
		int year;
		
		System.out.println("�smini gir");
		name = input.next();
		
		System.out.println("Do�um y�l�n� gir");
		year = input.nextInt();
		
		System.out.println(name + " sen " + (2017 - year) + " ya��ndas�n");
		
		/* Program�n sonu */
	}

}