package tgm_kurs_8_2;

import tgm_kurs_8_1.TGM1;

public class TGM3 {

	public static void main (String[] args) {
		TGM1 tgm1 = new TGM1();
		
		// Farklı pakketten ise no modif ile dahi erişim
		// sağlanmadı. Ancak public her türlü çalıştı
		System.out.println(tgm1.no);
		System.out.println(tgm1.text);
		System.out.println(tgm1.sayi);
	}

}
