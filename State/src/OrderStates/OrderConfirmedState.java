package OrderStates;

public class OrderConfirmedState implements OrderState {
	private Order order;

	public OrderConfirmedState(Order order) {
		this.order = order;
	}

	@Override
	public void confirm() {
		System.out.println("Invalid action. Order is already confirmed.");
	}

	@Override
	public void cancel() {
		System.out.println("Order Canceled");
		order.setState(new OrderCanceledState(order));

	}

	@Override
	public void sent() {
		System.out.println("Sending package.");
		order.setState(new OrderSendState(order));
	}
}
