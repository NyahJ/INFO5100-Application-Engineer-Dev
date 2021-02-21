package Q1;

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.draw();
		Circle c = new Circle(4.0);
		c.getArea();
		c.getPerimeter();
		c.draw();
		Rectangle r = new Rectangle(2.0, 3.0);
		Square sq = new Square(4.0);
		r.getArea();
		r.getPerimeter();
		r.draw();
		sq.getArea();
		sq.getPerimeter();
	}

}
