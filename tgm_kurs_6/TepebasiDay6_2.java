package tgm_kurs_6;

public class TepebasiDay6_2 {

	public static void main (String[] args) {
		// Main methodundaki args dizisini kullandık
		for (String text : args)
			System.out.println(isPalindrome(text));
	}
	
	// Bu methodda kelimenin tersi
	// aynı mı diye kontrol ediyor
	public static boolean isPalindrome (String text) {
		String reverse = "";
		
		// Aynı kelimeyi ters şekilde yeni bir değişkene 
		// atıyoruz aynı ise palindrome oluyor
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse += text.charAt(i);
		}

		return reverse.equals(text);

	}

}