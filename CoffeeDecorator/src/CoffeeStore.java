import beverages.Beverage;
import beverages.Decaf;
import beverages.Espresso;
import enhancements.Caramel;
import enhancements.Milk;

public class CoffeeStore {

	public static void main(String[] args) {
		Beverage a = new Milk(new Caramel(new Decaf()));
		System.out.println(a.description() + " costs " + a.cost() + "$");
		Beverage b = new Milk(new Espresso());
		System.out.println(b.description() + " costs " + b.cost() + "$");
	}
}
