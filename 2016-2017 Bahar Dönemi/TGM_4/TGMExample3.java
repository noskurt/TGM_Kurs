package TGM_4;

public class TGMExample3 {

	public static void main(String[] args) {
		func1();
		func2("Merhaba");
		System.out.println(func3());
		System.out.println(func4(5, func3()));
	}

	public static void func1() {
		System.out.println("Func içerisinden");
	}

	public static void func2(String text) {
		System.out.println(text);
	}

	public static int func3() {
		return 5;
	}

	public static int func4(int a, int b) {
		return a + b;
	}

}
