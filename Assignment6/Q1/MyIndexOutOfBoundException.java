package Q1;

public class MyIndexOutOfBoundException extends Exception {
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
		super("Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound);
	}
}
