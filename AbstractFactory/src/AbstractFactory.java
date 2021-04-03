import factory.*;
import factory.tools.ErasingObject;
import factory.tools.WrintingObject;

import java.util.Scanner;

public class AbstractFactory {

	public static void main(String[] args) {
		System.out.println("Are you writing a formal document (y/n)?");

		WritingFactory factory;

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(input.equalsIgnoreCase("y")){
			factory = new FormalWritingFactory();
		}
		else if(input.equalsIgnoreCase("n")){
			factory = new InformalWritingFactory();
		}
		else {
			throw new RuntimeException("Invalid input");
		}

		WrintingObject wrintingObject = factory.getWritingObject();
		ErasingObject erasingObject = factory.getEraserObject();

		wrintingObject.write();
		erasingObject.erase();

	}
}
