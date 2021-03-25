package entities;

public class Customer implements Observer{
	private int id;
	private String name;
	private String email;

	public Customer(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public void update(Product product) {
		System.out.println("Customer "+ name + " notified. Product " + product.getName() + " is back in stock.");
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		return id == (((Customer) obj).getId());
	}
}
