package TGM_3;

public class TGMExample6 {

	public static void main(String[] args) {

		int total = 0;

		for (int i = 0; i < 10; i++) {
			total += i;
			if (total >= 10) break;
		}

		System.out.println(total);

		total = 0;

		for (int i = 0; i < 10; i++) {
			if (i == 5 || i == 6) continue;
			total += i;
		}

		System.out.println(total);

	}

}
