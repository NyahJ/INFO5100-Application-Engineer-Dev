package Q1;

public class Test {

	public static void main(String[] args) throws MyIndexOutOfBoundException {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3};
		int index = 3;
		try {
			int b = a[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new MyIndexOutOfBoundException(0, a.length - 1, index);
		}
	}

}
