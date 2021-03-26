package enhancements;

import beverages.Beverage;

public class Milk extends Beverage {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 2.7;
	}

	@Override
	public String description() {
		return beverage.description()+ " with milk";
	}
}
