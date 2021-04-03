package factory.tools;

public class Pencil implements WrintingObject {
	@Override
	public void write() {
		System.out.println("Writing with a pencil.");
	}
}
