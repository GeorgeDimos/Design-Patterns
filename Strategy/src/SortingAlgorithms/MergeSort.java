package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort implements ArraySort {
	@Override
	public int[] sort(int[] array) {
		System.out.println("Merge Sort");
		sort(array, 0, array.length - 1);
		return array;
	}

	private void sort(int[] array, int left, int right) {
		if (right - left == 0) return;

		int middle = (right + left) / 2;
		sort(array, left, middle);
		sort(array, middle + 1, right);
		merge(array, left, right, middle);
	}

	private void merge(int[] array, int left, int right, int middle) {
		int[] n = new int[right - left + 1];
		int l = left, m = middle + 1;
		for (int i = 0; i < n.length; i++) {
			if (l > middle)
				n[i] = array[m++];
			else if (m > right)
				n[i] = array[l++];
			else if (array[l] < array[m])
				n[i] = array[l++];
			else
				n[i] = array[m++];
		}
		for (int i = 0; i < n.length; i++) {
			array[left+i] = n[i];
		}
	}


}
