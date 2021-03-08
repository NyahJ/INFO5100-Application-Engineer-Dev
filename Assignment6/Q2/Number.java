package Q2;

public class Number {
	public static int count(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("The divisor cannot be 0");
		}
		return result;
	}
}
