package SortingAlgorithms;

import java.util.Arrays;

public class ArraysSort implements ArraySort{
	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}
}
