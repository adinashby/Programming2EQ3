
public class MultiExample1 {

	public static void main(String[] args) {
        
		int[][] theArray = {
                {1, 2, 3, 4}, 
                {5, 6, 7, 8}, 
                {9, 10, 11, 12}, 
                {13, 14, 15, 16}
            };
		
		int sum = 0;
		
		for(int i = 0; i < theArray.length; i++) {
			for(int j = 0; j < theArray[i].length; j++) {
				if(i == j) {
					sum += theArray[i][j];
				}
			}
		}
		
		for(int i = 0; i < theArray.length; i++) {
			for(int j = theArray[i].length - 1; j >= 0; j--) {
				if(i + j == theArray.length - 1) {
					sum += theArray[i][j];
				}
			}
		}
		
		if(theArray.length % 2 == 1) {
			sum -= theArray[theArray.length / 2][theArray.length / 2];
		}
		
		System.out.println("Sum is: " + sum);
		
		// Primary
		// 0 0
		// 1 1
		// 2 2
		// 3 3
		
		// secondary
		// 0 3
		// 1 2
		// 2 1
		// 3 0
		
		// 1 1
	}

}
