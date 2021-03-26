package enhancements;

import beverages.Beverage;

public class Caramel extends Beverage {
	private Beverage beverage;

	public Caramel(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost()+1;
	}

	@Override
	public String description() {
		return beverage.description()+" with caramel";
	}
}
