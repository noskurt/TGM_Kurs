package tgm_kurs_7;

// Bu sınıfta bir dairenin özelliklerini tutuyoruz
// set ve get methodları ile veri atama ve verilere erişim sağlıyoruz
public class Circle {
	
	// 3 tane global değişkenimiz var bir tanesi static
	// static olan değişken bellekte tek yerde tutuluyor
	// bu yüzden ayrı ayrı quanitity isminde değişken oluşmuyor
	double radius;
	String color;
	static int quantity;
	
	public Circle() {
		quantity++;
	}
	
	public Circle(double r, String s){
		quantity++;
		radius = r;
		color = s;
	}

	public void setRadius (double r) {
		radius = r;
	}

	public void setColor (String s) {
		color = s;
	}

	public double getRadius () {
		return radius;
	}

	public String getColor () {
		return color;
	}

	public double getPerimeter () {
		return 2 * Math.PI * radius;
	}

	public double getArea () {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// toString methodu ile tüm özellikere erişebiliriz
	public String toString () {
		return "Radius " + getRadius() + " Color " + getColor() + " Perimeter "
				+ getPerimeter() + " Area " + getArea();
	}
}