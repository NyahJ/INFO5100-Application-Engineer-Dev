package assignment3;

public class ReverseString {
	public static String reverseString(String input) {
		String[] inputArray = input.split(" ");
		String result = inputArray[inputArray.length - 1];
		for(int i = inputArray.length - 2; i >= 0; i--) {
			result = result + " " + inputArray[i];
		}
		return result;
	}
}
