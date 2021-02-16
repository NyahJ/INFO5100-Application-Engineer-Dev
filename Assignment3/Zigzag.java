package assignment3;

public class Zigzag {
	public static String convert(String s, int numRows) {
		int period = numRows * 2 - 2;
		String result = "";
		for (int i = 0; i < numRows; i++) {
			int left = i;
			int right = period - left;
			while (right < s.length()) {
				result += s.charAt(left);
				if (right != left + period && right != left) {
					result += s.charAt(right);
				}
				left += period;
				right += period;
			}
			if (left < s.length()) {
				result += s.charAt(left);
			}
		}
		return result;
	}
}
