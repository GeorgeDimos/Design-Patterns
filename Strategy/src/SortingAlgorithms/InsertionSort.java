package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort implements ArraySort {
	@Override
	public int[] sort(int[] array) {
		System.out.println("Insertion Sort");
		for (int i = 1; i < array.length; i++) {
//			System.out.println(Arrays.toString(array));
			for (int j = i - 1; j >= 0; j--) {
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
