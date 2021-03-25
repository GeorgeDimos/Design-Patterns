package gateways;

import entities.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerGateway {
	private final Map<Integer, Customer> customers;

	public CustomerGateway() {
		this.customers = new HashMap<>();
	}

	public List<Customer> getCustomers() {
		return new ArrayList<>(customers.values());
	}

	public void saveCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
}
