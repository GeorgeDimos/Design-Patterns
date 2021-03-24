package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort implements ArraySort {
	@Override
	public int[] sort(int[] array) {
		System.out.println("Bubble Sort");
		for (int i = 0; i < array.length; i++) {
//			System.out.println(Arrays.toString(array));
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
