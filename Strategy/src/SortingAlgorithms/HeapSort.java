package SortingAlgorithms;

public class HeapSort implements ArraySort {
	@Override
	public int[] sort(int[] array) {
		System.out.println("Heap Sort");
		int N = array.length - 1;
		int middle = N / 2;
		for (int i = middle; i >= 0; i--) {
			makeHeap(array, i, N);
		}

		for (int i = 0; i < array.length; i++) {
			swap(array, 0, N--);
			makeHeap(array, 0, N);
		}

		return array;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private void makeHeap(int[] array, int father, int arrayLength) {
		while (2 * father + 1 <= arrayLength) {
			int maxSon = 2 * father + 1;
			if(maxSon < arrayLength &&  array[maxSon] < array[maxSon+1]) maxSon++;
			if(array[father] > array[maxSon]) break;
			swap(array, father, maxSon);
			father = maxSon;
		}
	}
}
