import factories.PenFactory;
import factories.PencilFactory;
import factories.WritingFactory;

import java.util.Scanner;

public class Factories {

	public static void main(String[] args) {
		WritingFactory factory;

		System.out.println("Are you writing a formal document (y/n)?");

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(input.equalsIgnoreCase("y")){
			factory = new PenFactory();
		}
		else if(input.equalsIgnoreCase("n")){
			factory = new PencilFactory();
		}
		else {
			throw new RuntimeException("Invalid input");
		}

		factory.write();
	}
}
