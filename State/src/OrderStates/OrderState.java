package OrderStates;

public interface OrderState {
	void confirm();
	void cancel();
	void sent();
}
