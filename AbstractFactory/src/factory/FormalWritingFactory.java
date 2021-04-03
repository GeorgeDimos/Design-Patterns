package factory;

import factory.tools.CorrectionTape;
import factory.tools.ErasingObject;
import factory.tools.Pen;
import factory.tools.WrintingObject;

public class FormalWritingFactory implements WritingFactory {
	@Override
	public WrintingObject getWritingObject() {
		return new Pen();
	}

	@Override
	public ErasingObject getEraserObject() {
		return new CorrectionTape();
	}
}
