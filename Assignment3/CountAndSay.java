package assignment3;

public class CountAndSay {
	public static String countAndSay(int n) {
		String result = "1";
		for (int i = 0; i < n - 1; i++) {
			result = getNextTerm(result);
		}
		return result;
	}
	
	private static String getNextTerm(String input) {
		String output = "";
		char c = ' ';
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (c == input.charAt(i)) {
				count += 1;
			} else {
				if (c != ' ') {
					output += String.valueOf(count);
					output += c;
				}
				c = input.charAt(i);
				count = 1;
			}
		}
		output += String.valueOf(count);
		output += c;
		return output;
	}
}
