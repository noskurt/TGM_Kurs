package tgm_kurs_4;

public class TepebasiDay4_1 {

	public static void main (String[] args) {
		
		// Bir method içersindeki değişiklik
		// başka bir methodu etkilemez
		// ancak return değeriyle değişim
		// sağlanabilir
		int number1 = 10;
		int number2 = 15;

		System.out.println(number1 + " " + number2);
		swap(number1, number2);
		System.out.println(number1 + " " + number2);

		System.out.println(isPrime(10));
	}

	public static void swap (int no1, int no2) {
		System.out.println(no1 + " " + no2);
		int temp = no1;
		no1 = no2;
		no2 = temp;
		System.out.println(no1 + " " + no2);
	}

	public static boolean isPrime (int number) {
		boolean prime = true;

		for (int i = 2; i < number; i++) {
			System.out.println("Hell");
			if (number % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;
	}
}