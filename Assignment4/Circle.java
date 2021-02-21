package Q1;

public class Circle extends Shape {
	double radius;
	public Circle(double radius) {
		area = 3.14 * radius * radius;
		perimeter = 3.14 * 2 * radius;
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

}
