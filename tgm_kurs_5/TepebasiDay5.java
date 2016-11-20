package tgm_kurs_5;

import java.util.Scanner;

public class TepebasiDay5 {

	public static void main (String[] args) {

		int number = 156;
		String text = "TGM";
		double ondalik = 14.324768;

		// printf kullanımında göstereceğimiz
		// değişkenlere oynama yapabiliyorduk
		// %d, %s, %f gibi ifadeler parantez
		// ardından gelen değişkenleri sıra ile
		// sahipleniyor ve olduğu yere koyuyor
		System.out.printf("Tam sayımız %d yazımız %s ondalıklı sayımız %.2f\n", number, text, ondalik);

		// Math sınıfında birçok kullanışlı method mevcut
		double PI = Math.PI;
		System.out.println(PI);

		System.out.println(Math.min(2, 5));

		System.out.println(Math.abs(-5));

		System.out.println((int) (Math.random() * 10));

		System.out.println("------------------------------");

		// String sınıfının sahip olduğu
		// methodlardan bazılarını görebilirsiniz
		String text1 = "TGM";
		String text2 = "Eskişehir";

		System.out.println(text1.equals(text2));
		System.out.println(text2.contains("Eski"));

		String value = String.valueOf(479812);
		System.out.println(value);

		Scanner scan = new Scanner(System.in);

		System.out.println("------------------------------");

		// next ve nextLine farkını burdan anlayabilirsiniz
		// birisi sadece bir kelime alırken boşluğa kadar
		// diğeri ise komple satırı alıyor
		String scanText1 = scan.nextLine();
		String scanText2 = scan.next();
		String scanText3 = scan.next();

		System.out.println(scanText1 + " " + scanText2 + " " + scanText3);

		String textParse = "46378";

		// parseInt methodu String tipini Integer tipine değiştirir
		// diğer değişkenlerinde aynı yöntemde kullanımı mevcuttur
		System.out.println(Integer.parseInt(textParse) + 2);

	}
}