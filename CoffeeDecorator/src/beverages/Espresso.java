package beverages;

public class Espresso extends Beverage{
	@Override
	public double cost() {
		return 3;
	}

	@Override
	public String description() {
		return "Espresso Coffee";
	}
}
