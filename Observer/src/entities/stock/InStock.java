package entities.stock;

import entities.Product;

public class InStock implements StockState {
	private Product product;

	public InStock(Product product) {
		this.product = product;
	}

	@Override
	public void setStock(int stock) {
		if (stock == 0){
			product.setStockState(new OutOfStock(product));
		}
	}
}
