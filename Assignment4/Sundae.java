package Q3;

public class Sundae extends IceCream{
	public String nameOfTopping;
	public int costOfTopping;
	
	public Sundae(String name, int cost, String nameOfTopping, int costOfTopping) {
		super(name, cost);
		this.nameOfTopping = nameOfTopping;
		this.costOfTopping = costOfTopping;
	}
	
	@Override
	public int getCost() {
		return cost + costOfTopping;
	}
}
