package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort implements ArraySort {

	@Override
	public int[] sort(int[] array) {
		System.out.println("Selection Sort");
		for (int i = 0; i < array.length; i++) {
//			System.out.println(Arrays.toString(array));
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}
}
