package factories;

import factories.writing_objects.Pensil;
import factories.writing_objects.WritingObject;

public class PencilFactory extends WritingFactory {

	public WritingObject createObject() {
		return new Pensil();
	}
}
