import java.util.Arrays;

public class Multidimentional1 {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[5];
		
		// myIntArray[0] = 5
		// myIntArray[1] = 6	
		
		int[][] myMulti = new int[2][3];
		
		myMulti[0][2] = 59;
		myMulti[1][1] = 13;
		
		System.out.println(Arrays.deepToString(myMulti));
		
		for(int i = 0; i < myMulti.length; i++) {
			for(int j = 0; j < myMulti[i].length; j++) {
				System.out.print(myMulti[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] myMulti2 = new int[2][];
		
		myMulti2[0] = new int[5];
		myMulti2[1] = new int[2];
		
		System.out.println(Arrays.deepToString(myMulti));
		
	    int sum = 0;

	    for (int[] each : myMulti)
	        for (int num : each)
	            sum += num;
	    
	    System.out.println(sum);
	}

}
