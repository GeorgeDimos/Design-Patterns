package OrderStates;

public class OrderCanceledState implements OrderState{
	private Order order;

	public OrderCanceledState(Order order) {
		this.order = order;
	}

	@Override
	public void confirm() {
		System.out.println("Reactivating Order");
		order.setState(new OrderConfirmedState(order));
	}

	@Override
	public void cancel() {
		System.out.println("Order Canceled");
	}

	@Override
	public void sent() {
		System.out.println("Invalid action. Order should be confirmed first.");
	}
}
