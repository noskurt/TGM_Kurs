package TGM_4;

import java.util.Scanner;

public class TGMExample2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int now = 0, prev1 = 1, prev2 = 1, limit;

		System.out.println("Sayý gir=> ");
		limit = input.nextInt();

		System.out.print(prev1 + " ");
		System.out.print(prev2 + " ");

		for (int i = 0; i < limit - 2; i++) {
			now = prev1 + prev2;
			System.out.print(now + " ");
			
			if (i % 10 == 0 && i != 0)
				System.out.println();
			
			prev1 = prev2;
			prev2 = now;

		}

	}

}
