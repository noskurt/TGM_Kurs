package tgm_kurs_7;

public class Test {
	
	public static void main (String[] args) {
		
		// Circle sınıfı için bir nesne oluşturduk
		// Daha sonra bu nesne için özellikler tanımladık

		Circle circle = new Circle();

		circle.setRadius(10);
		circle.setColor("Yellow");

		System.out.println(circle.toString());

		System.out.println();

		Circle circle_1 = new Circle(5.6, "Red");

		System.out.println(circle_1.toString());

		Circle circle_2 = new Circle();

		System.out.println(circle_2.toString());

		System.out.println();

		System.out.println(Circle.quantity);

	}
}