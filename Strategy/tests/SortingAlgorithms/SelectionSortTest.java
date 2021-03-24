package SortingAlgorithms;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest extends TemplateSortingTests{

	@BeforeEach
	void setUp() {
		alg = new SelectionSort();
	}
}