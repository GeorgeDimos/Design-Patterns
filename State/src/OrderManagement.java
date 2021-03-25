import OrderStates.Order;

import java.util.Scanner;

public class OrderManagement {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(in.next().equalsIgnoreCase("n")){
			Order order = new Order();

			System.out.println("Order Received.");
			do {
				System.out.println("Press 1 to confirm order.");
				System.out.println("Press 2 to cancel order.");
				System.out.println("Press 3 to sent order.");

				int input = in.nextInt();
				switch (input){
					case 1:
						order.confirm();
						break;
					case 2:
						order.cancel();
						break;
					case 3:
						order.sent();
						break;
				}
				if(input == 0)
					break;

			}while (true);
		}
	}
}
