package tgm_kurs_8_1;

import java.math.BigInteger;

public class Test {

	int number;
	String name;
	
	// This komutu Test(number, name) yaratıcısını çağırıyor
	// Bu komut ilk satırda olmak zorunda
	public Test() {
		this(45, "Emre");
		System.out.println("Constructor");
	}

	public Test(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public static void main (String[] args) {
		
		// BigInteger sınıfı long değişkeninin bile taşıyamayacağı
		// değerleri kullanmak içindir
		BigInteger big = new BigInteger("2138129797383792173892173817293712973912879382913");
		BigInteger big2 = new BigInteger("2");
		
		BigInteger result = big.multiply(big2);
		
		System.out.println(result);
		
		// String i normal nesne gibi oluşturabiliriz
		String str = new String("asdas");
		str = "adkas";
		System.out.println(str);
		
		// TurkishChar sınıfını nesne haline getirerek
		// kelimemizi yada cümlemizi türkçe karakterlerden arındırdık
		TurkishChar turk = new TurkishChar("fıstıkçı şahap");
		turk.generate();
		System.out.println(turk.getFixedText());
		System.out.println(turk.getQuantity());	
	}

	public int getNumber () {
		return number;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}
}