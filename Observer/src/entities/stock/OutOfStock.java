package entities.stock;

import entities.Product;

public class OutOfStock implements StockState{
	private Product product;

	public OutOfStock(Product product) {
		this.product = product;
	}

	@Override
	public void setStock(int stock) {
		product.sendNotification();
		product.setStockState(new InStock(product));
	}
}
