import java.util.Arrays;

public class TestingSamples {

	public int addNumbers(int a, int b) {
		return a + b;
	}
	
	public int[] mulitplyArray(int[] input, int factor) {
		for(int i = 0; i < input.length; i++) {
			input[i] *= factor;
		}
		
		return input;
	}
	
	public String findThreeSmallestElements(int[] input) {
		//Arrays.sort(input);
		// {1, 4, 17, 7, 25, 3, 100}
		// {6, 2, 3, 66, 24, 1, 66, 42, 5}
		
		int[] result = new int[3];
		
		result[0] = Integer.MAX_VALUE;
		result[1] = Integer.MAX_VALUE;
		result[2] = Integer.MAX_VALUE;
		
//		if (input[i] < result[2] 
//				&& input[i] < result[1] 
//				&& input[i] < result[0]) {
//				
//				
//			}
		
		//result = { 2, 3, 6 }
		
		for(int i = 0; i < input.length; i++) {
			if(input[i] < result[2]) {
				if(input[i] < result[1]) {
					if(input[i] < result[0]) {
						result[2] = result[1];
						result[1] = result[0];
						result[0] = input[i];
					} else {
						result[2] = result[1];
						result[1] = input[i];
					}
				} else {
					result[2] = input[i];
				}
			} 
		}
		
		return result[0] + " " + result[1] + " " + result[2];
	}
}
