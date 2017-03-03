package tgm_kurs_5;

public class TepebasiDay5_2 {

	public static void main (String[] args) {

		int var = 245;
		
		// Dizilerin kullanım şekli değişiklik gösterebilir
		int[] array = new int[15];
		String[] textArray = {"Apple", "Samsung", "HTC"};

		for (int i = 0; i < textArray.length; i++)
			System.out.println(textArray[i]);
		
		// foreach döngüsü dizinin 
		// tüm elemanlarını dolaşır
		for (String t : textArray)
			System.out.println(t);

	}

}
