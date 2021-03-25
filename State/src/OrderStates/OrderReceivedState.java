package OrderStates;

public class OrderReceivedState implements OrderState {

	private Order order;

	public OrderReceivedState(Order order) {
		this.order = order;
	}

	@Override
	public void confirm() {
		System.out.println("Order Confirmed");
		order.setState(new OrderConfirmedState(order));
	}

	@Override
	public void cancel() {
		System.out.println("Order Canceled");
		order.setState(new OrderCanceledState(order));
	}

	@Override
	public void sent() {
		System.out.println("Invalid action. Order should be confirmed first.");
	}
}
