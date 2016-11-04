package tgm_kurs_3;

import java.util.Scanner;

public class TepebasiDay3_6 {

	public static void main (String[] args) {
		
		// break komutuna özel bir örnek
		// toplam değer 10'dan büyük olunca
		// döngü sonlanıyor
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (sum > 10) break;
			sum += i;
		}

		System.out.println(sum);

		// continue komutu için bir örnek
		// 5 ve 6 değerlerini pas geçiyor
		// toplama onları eklemiyor
		
		int no = 0;

		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6) continue;
			no += i;
		}

		System.out.println(no);

	}

}
