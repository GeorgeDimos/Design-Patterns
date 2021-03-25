package gateways;

import entities.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductGateway {
	private final Map<Integer, Product> products;

	public ProductGateway() {
		this.products = new HashMap<>();
	}

	public List<Product> getProducts() {
		return new ArrayList<>(products.values());
	}

	public void saveProduct(Product product) {
		products.put(product.getId(), product);
	}

	public List<Product> findByName(String name) {
		return products.values().stream().filter( product -> product.getName().contains(name)).collect(Collectors.toList());
	}

	public List<Product> getOutOfStockProducts() {
		return products.values().stream().filter( product -> product.getStock() == 0).collect(Collectors.toList());
	}
}
