package SortingAlgorithms;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest extends TemplateSortingTests{

	@BeforeEach
	void setUp() {
		alg = new InsertionSort();
	}
}