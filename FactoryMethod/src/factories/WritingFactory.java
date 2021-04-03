package factories;

import factories.writing_objects.WritingObject;

public abstract class WritingFactory {
	protected abstract WritingObject createObject();

	public void write() {
		String out = someMethod();
		WritingObject w = createObject();
		out+=w.write();
		out+=someOtherMethod();
		System.out.println(out);
	}

	private String someMethod() {
		return "====================== Writing Begins ======================\n";
	}

	private String someOtherMethod() {
		return "\n====================== Writing Ends ========================";
	}
}
