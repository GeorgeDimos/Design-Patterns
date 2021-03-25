package entities;

import entities.stock.InStock;
import entities.stock.OutOfStock;
import entities.stock.StockState;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {
	private int id;
	private String name;
	private int stock;
	private StockState stockState;
	private List<Observer> observers = new ArrayList<>();

	public Product(int id, String name, int stock) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		stockState = stock > 0 ? new InStock(this) : new OutOfStock(this);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		stockState.setStock(stock);
		this.stock = stock;
	}

	public void setStockState(StockState stockState) {
		this.stockState = stockState;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		return id == (((Product) obj).getId());
	}

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void sendNotification() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
