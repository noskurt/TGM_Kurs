package TGM_1;
public class TGMExample2 {
	public static void main(String[] args) {
		
		int second = 500;
		int minute = second / 60;
		int remain = second % 60;
		
		System.out.println(second + " saniye");
		System.out.println(minute + " dakika");
		System.out.println(remain + " saniye eder");
		
		second++;
		System.out.println(second);
		
		double number = 5.678;
		int tam = (int)number;
		System.out.println(tam);
		
		
	}
}