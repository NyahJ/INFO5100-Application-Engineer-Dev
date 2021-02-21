package Q3;

public class DessertShop {
	public static double taxRate = 0.065;
	public static String name = "M & M Dessert Shop";
	public static int sizeOfItemName = 100;
	public static int widthOfCosts = 100;
	
	public static String cents2dollarsAndCents(int cents) {
		int dollars = cents / 100;
		cents %= 100;
		String result = "";
		if (dollars >= 1) {
			result += String.valueOf(dollars);
		}
		result += ".";
		if (cents >= 10) {
			result += String.valueOf(cents);
		} else {
			result += "0" + String.valueOf(cents);
		}
		return result;
	}
}
