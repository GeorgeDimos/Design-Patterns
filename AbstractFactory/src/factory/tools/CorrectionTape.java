package factory.tools;

public class CorrectionTape implements ErasingObject {
	@Override
	public void erase() {
		System.out.println("Erasing with a correction tape.");
	}
}
