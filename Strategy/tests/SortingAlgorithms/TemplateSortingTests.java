package SortingAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class TemplateSortingTests {

	ArraySort alg;

	@BeforeEach
	abstract void setUp();

	@Test
	void sortedArray() {
		int[] array = {1, 2, 3, 4, 5, 6};
		int[] result = alg.sort(Arrays.copyOf(array, array.length));
		assertArrayEquals(array, result);
	}

	@Test
	void reverseSortedArray() {
		int[] array = {6, 5, 4, 3, 2, 1};
		int[] result = alg.sort(Arrays.copyOf(array, array.length));
		Arrays.sort(array);
		assertArrayEquals(array, result);
	}

	@Test
	void randomSmallArray() {
		int[] array = {34, 35, 15, 69, 12};
		int[] result = alg.sort(Arrays.copyOf(array, array.length));
		Arrays.sort(array);
		assertArrayEquals(array, result);
	}

	@Test
	void randomBigArrayEven() {
		int[] array = new int[500];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10000);
		}
		int[] result = alg.sort(Arrays.copyOf(array, array.length));
		Arrays.sort(array);
		assertArrayEquals(array, result);
	}

	@Test
	void randomBigArrayOdd() {
		int[] array = new int[501];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10000);
		}
		int[] result = alg.sort(Arrays.copyOf(array, array.length));
		Arrays.sort(array);
		assertArrayEquals(array, result);
	}
}