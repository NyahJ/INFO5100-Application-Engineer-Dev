package Q3;

public class Cookie extends DessertItem{
	public int number;
	public int pricePerDozen;
	
	public Cookie(String name, int number, int pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	@Override
	public int getCost() {
		double cost = number / 12.0 * pricePerDozen;
		return (int) Math.round(cost);
	}
}
