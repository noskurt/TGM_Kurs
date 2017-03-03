package TGM_2;

public class TGMExample4 {
	
	// Bu kod mantýksal operatör içerir
	public static void main(String[] args) {
		
		int number = 11;
		int testNumber;
		
		if (number % 5 == 0 || number % 2 == 0){
			System.out.println("5'e veya 2'ye tam bölünür");
		} else {
			System.out.println("5'e veya 2'ye tam bölünmez");
		}
		
		if (number < 0){
			testNumber = -1;
		} else {
			testNumber = 1;
		}
		
		testNumber = (number < 0) ? -1 : 1;
		
		System.out.println(testNumber);
		
	}

}
