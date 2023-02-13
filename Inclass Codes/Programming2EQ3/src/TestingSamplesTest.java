
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingSamplesTest {
	
	TestingSamples testingSamples;
	
	@BeforeAll
	static void setUp() {
		System.out.println("Testing begins.....\n");
	}
	
	@BeforeEach
	void setUpEach() {
		testingSamples = new TestingSamples();
		System.out.println("Before test");
	}
	
	@AfterEach
	void tearDownEach() {
		System.out.println("Successfully done\n");
	}
	
	@AfterAll
	static void tearDown() {
		System.out.println("Done!!");
	}

	@Test
	void addNumbersTest1() {
		System.out.println("Test is running....");
		
		int actual = testingSamples.addNumbers(5, 3);
		int expected = 8;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void addNumbersTest2() {
		System.out.println("Test is running....");
		
		int actual = testingSamples.addNumbers(2, 3);
		int expected = 5;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void multiplyArrayTest1() {
		System.out.println("Test is running....");
		
		int[] input = {1, 2, 3};
		
		int[] actual = testingSamples.mulitplyArray(input, 2);
		int[] expected = {2, 4, 6};
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void multiplyArrayTest2() {
		System.out.println("Test is running....");
		
		int[] input = {10, 12, 14};
		
		int[] actual = testingSamples.mulitplyArray(input, 2);
		int[] expected = {20, 24, 28};
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void findThreeSmallestElementsTest1() {
		int[] input = {1, 4, 17, 7, 25, 3, 100};
		
		String actual = testingSamples.findThreeSmallestElements(input);
		String expected = "1 3 4";
		
		assertEquals(expected, actual);
	
	}
	
	@Test
	void findThreeSmallestElementsTest2() {
		int[] input = {6, 2, 3, 66, 24, 1, 66, 42, 5};
		
		String actual = testingSamples.findThreeSmallestElements(input);
		String expected = "1 2 3";
		
		assertEquals(expected, actual);
	
	}

}
