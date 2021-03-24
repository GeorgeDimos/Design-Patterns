import SortingAlgorithms.ArraySort;

import java.util.Arrays;

public class SortingComparison {
	private ArraySort sortingAlgorithm;
	private final int[] array;

	public SortingComparison(int[] array) {
		this.array = array;
	}

	public void setSortingAlgorithm(ArraySort sortingAlgorithm) {
		this.sortingAlgorithm = sortingAlgorithm;
	}

	public long timeToSort() {
		long start = System.currentTimeMillis();
		int[] arrayToSort = Arrays.copyOf(this.array, array.length);
		sortingAlgorithm.sort(arrayToSort);
		long end = System.currentTimeMillis();
		return (end - start);
	}

}
