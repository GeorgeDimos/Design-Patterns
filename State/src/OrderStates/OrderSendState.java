package OrderStates;

public class OrderSendState implements OrderState {
	private Order order;

	public OrderSendState(Order order) {
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
		System.out.println("Package was lost. Resending.");
	}
}
