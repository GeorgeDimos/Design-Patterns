import entities.Customer;
import entities.Product;
import gateways.CustomerGateway;
import gateways.ProductGateway;

public class Setup {

	public static void setupData(ProductGateway productGateway, CustomerGateway customerGateway) {

		productGateway.saveProduct(new Product(1, "test1", 2));
		productGateway.saveProduct(new Product(2, "test2", 1));
		productGateway.saveProduct(new Product(3, "test3", 1));
		productGateway.saveProduct(new Product(4, "test4", 0));

		customerGateway.saveCustomer(new Customer(1, "Customer1", "customer@email.com"));
		customerGateway.saveCustomer(new Customer(2, "Customer2", "customer2@email.com"));
	}
}
