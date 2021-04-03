package factory.tools;

public class Pen implements WrintingObject {
	@Override
	public void write() {
		System.out.println("Writing with a pen.");
	}
}
