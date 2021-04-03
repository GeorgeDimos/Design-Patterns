package factory;

import factory.tools.Eraser;
import factory.tools.ErasingObject;
import factory.tools.Pencil;
import factory.tools.WrintingObject;

public class InformalWritingFactory implements WritingFactory {
	@Override
	public WrintingObject getWritingObject() {
		return new Pencil();
	}

	@Override
	public ErasingObject getEraserObject() {
		return new Eraser();
	}
}
