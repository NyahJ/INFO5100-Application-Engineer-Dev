package Q3;

import java.util.List;
import java.util.ArrayList;

public class Checkout {
	private List<DessertItem> dessertItems;
	
	public Checkout() {
		this.dessertItems = new ArrayList<>();
	}
	
	public int numberOfItems() {
		return dessertItems.size();
	}
	
	public void enterItem(DessertItem item) {
		dessertItems.add(item);
	}
	
	public void clear() {
		dessertItems = new ArrayList<>();
	}
	
	public int totalCost() {
		int result = 0;
		for (DessertItem item : dessertItems) {
			result += item.getCost();
		}
		return result;
	}
	
	public int totalTax() {
		double tax = totalCost() * DessertShop.taxRate;
		return (int) Math.round(tax);
	}
	
	@Override
	public String toString() {
		String result = DessertShop.name + "\n";
		result += "-----------\n";
		result += "\n";
		
		for (DessertItem item : dessertItems) {
			if (item instanceof Candy) {
				Candy candy = (Candy) item;
				result += candy.weight + " lbs. @ " + DessertShop.cents2dollarsAndCents(candy.pricePerPound) + " /lb. \n"; 
			} else if (item instanceof Cookie) {
				Cookie cookie = (Cookie) item;
				result += cookie.number + " @ " + DessertShop.cents2dollarsAndCents(cookie.pricePerDozen) + " /dz. \n";
			}
			String cost = DessertShop.cents2dollarsAndCents(item.getCost());
			result += item.name;
			for (int i = 0; i < 50 - item.name.length() - cost.length(); i++) {
				result += " ";
			}
			result += cost + "\n";
		}
		
		result += "Tax                               " + DessertShop.cents2dollarsAndCents(totalTax()) + "\n";
		result += "Total Cost                        " + DessertShop.cents2dollarsAndCents(totalCost() + totalTax()) + "\n";
		return result;
	}
	
}
