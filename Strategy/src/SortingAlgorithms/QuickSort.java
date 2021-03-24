package SortingAlgorithms;

public class QuickSort implements ArraySort {
	@Override
	public int[] sort(int[] array) {
		System.out.println("Quick Sort");
		sort(array, 0, array.length - 1);
		return array;
	}

	private void sort(int[] array, int left, int right) {
		int pivot = array[right];
		int i = left, j = right;
		while (true) {

			while (array[i] < pivot) {
				i++;
			}

			while (array[j] >= pivot && j > left) {
				j--;
			}

			if (i >= j) {
				break;
			}

			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}

		array[right] = array[i];
		array[i] = pivot;


		if (i - 1 > left) sort(array, left, i - 1);
		if (right > i + 1) sort(array, i + 1, right);
	}
}
