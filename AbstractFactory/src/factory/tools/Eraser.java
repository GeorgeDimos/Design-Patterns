package factory.tools;

public class Eraser implements ErasingObject {
	@Override
	public void erase() {
		System.out.println("Erasing with an eraser.");
	}
}
