package SortingAlgorithms;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest extends TemplateSortingTests{

	@BeforeEach
	void setUp() {
		alg = new BubbleSort();
	}
}