import entities.Customer;
import entities.Product;
import gateways.Context;
import gateways.CustomerGateway;
import gateways.ProductGateway;

import java.util.List;

public class ShopManagement {

	public static void main(String[] args) {

		Context.productGateway = new ProductGateway();
		Context.customerGateway = new CustomerGateway();

		Setup.setupData(Context.productGateway, Context.customerGateway);

		List<Product> products = Context.productGateway.getProducts();
		Product p0 = products.get(0); //2
		Product p1 = products.get(1); //1
		Product p2 = products.get(2); //1
		Product p3 = products.get(3); //0

		List<Customer> customers = Context.customerGateway.getCustomers();
		Customer c1 = customers.get(0);
		Customer c2 = customers.get(1);

		p3.subscribe(c1);
		p1.subscribe(c1);

		p3.setStock(2);
		p1.setStock(1);

	}
}
