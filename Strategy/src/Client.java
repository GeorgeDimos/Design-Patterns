import SortingAlgorithms.*;

import java.util.Random;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		int[] array = new int[50000];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}

		SortingComparison comparison = new SortingComparison(array);

		System.out.println("Select sorting method for array (1,2,3,4,5,6). Press 0 to exit.");
		Scanner scanner = new Scanner(System.in);
		int choice;

		while ((choice = scanner.nextInt()) != 0) {
			switch (choice) {
				case 1:
					comparison.setSortingAlgorithm(new QuickSort());
					break;
				case 2:
					comparison.setSortingAlgorithm(new MergeSort());
					break;
				case 3:
					comparison.setSortingAlgorithm(new HeapSort());
					break;
				case 4:
					comparison.setSortingAlgorithm(new SelectionSort());
					break;
				case 5:
					comparison.setSortingAlgorithm(new InsertionSort());
					break;
				case 6:
					comparison.setSortingAlgorithm(new BubbleSort());
					break;
				case 7:
					comparison.setSortingAlgorithm(new ArraysSort());
					break;
			}
			System.out.println("Time: " + comparison.timeToSort() + "ms");
			System.out.println("Select sorting method for array (1,2,3). Press 0 to exit.");
		}

	}

}
