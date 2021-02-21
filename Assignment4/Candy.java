package Q3;

public class Candy extends DessertItem{
	public double weight;
	public int pricePerPound;
	
	public Candy(String name, double weight, int pricePerPound) {
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	@Override
	public int getCost() {
		double cost = weight * pricePerPound;
		return (int) Math.round(cost);
	}
	
}
