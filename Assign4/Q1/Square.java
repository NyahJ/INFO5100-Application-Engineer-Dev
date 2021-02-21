package Q1;

public class Square extends Shape{
	double side;
	public Square(double side) {
		perimeter = 4 * side;
		area = side * side;
		this.side = side;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
}
