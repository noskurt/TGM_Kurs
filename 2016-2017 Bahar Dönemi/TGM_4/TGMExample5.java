package TGM_4;

public class TGMExample5 {

	public static void main(String[] args) {
		findMax(5, 6, 7);
		findMax(5.6, 7.8);
		findMax(10, 11);
	}

	public static void findMax(int a, int b) {
		int max;
		if (a > b) max = a;
		else max = b;
		System.out.println(max);
	}

	public static void findMax(double a, double b) {
		double max;
		if (a > b) max = a;
		else max = b;
		System.out.println(max);
	}

	public static void findMax(double a, double b, double c) {
		double max;
		if (a > b && a > c) max = a;
		else if (b > a && b > c) max = b;
		else max = c;
		System.out.println(max);
	}
}