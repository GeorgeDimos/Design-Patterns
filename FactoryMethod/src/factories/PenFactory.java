package factories;

import factories.writing_objects.Pen;
import factories.writing_objects.WritingObject;

public class PenFactory extends WritingFactory {

	public WritingObject createObject() {
		return new Pen();
	}
}
