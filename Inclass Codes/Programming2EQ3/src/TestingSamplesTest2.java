import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestingSamplesTest2 {
	
	TestingSamples testingSamples = new TestingSamples();
	
	@Test
	void addNumbersTest1() {
		System.out.println("Test is running....");
		
		TestingSamples testingSamples = new TestingSamples();
		
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
}
