package SortingAlgorithms;

import org.junit.jupiter.api.BeforeEach;

class HeapSortTest extends TemplateSortingTests{
	@Override
	@BeforeEach
	void setUp() {
		alg = new HeapSort();

	}
}