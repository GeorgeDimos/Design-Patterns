package factory;

import factory.tools.ErasingObject;
import factory.tools.WrintingObject;

public interface WritingFactory {
	WrintingObject getWritingObject();
	ErasingObject getEraserObject();
}
