package beverages;

public class Decaf extends Beverage{
	@Override
	public double cost() {
		return 2.5;
	}

	@Override
	public String description() {
		return "Decaf Beverage";
	}
}
