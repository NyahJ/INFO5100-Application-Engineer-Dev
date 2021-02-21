package Q1;

public class Rectangle extends Shape{
	double width;
	double height;
	public Rectangle(double width, double height) {
		area = width * height;
		perimeter = 2 * ( width + height);
		this.width  = width;
		this.height  = height;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
