package QD;

public class Test {

	public static void main(String[] args) {
		int target =  3;
		int[] A = {1, 2, 3, 4, 5};
		
		System.out.println(closestToTarget(target, A));
	}
	
	public static int closestToTarget(int target, int[] A) {
		if (A == null || A.length == 0) {
			return -1;
		}
		int closestNum = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			int difference = Math.abs(target - A[i]);
			if (difference < closestNum) {
				closestNum = difference;
			} else {
				return i - 1;
			}
		}
		return A.length - 1;
	}

}
