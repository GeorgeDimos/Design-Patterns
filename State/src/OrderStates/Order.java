package OrderStates;

public class Order {

	private OrderState state = new OrderReceivedState(this);

	public void setState(OrderState state) {
		this.state = state;
	}

	public void confirm() {
		state.confirm();
	}

	public void sent() {
		state.sent();
	}

	public void cancel() {
		state.cancel();
	}
}
