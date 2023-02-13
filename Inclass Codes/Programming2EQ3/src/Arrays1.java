import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
//		double[] scores = new double[18];
//		//double scores[] = new double[22];
//		
//		System.out.println(Arrays.toString(scores));
//		
//		Clock[] clocks = new Clock[5];
//		
//		//System.out.println(clocks);
//		System.out.println(Arrays.toString(clocks));
//		
//		String[] validDifficultyLevels = {"Easy", "Medium", "Hard"};
//		System.out.println(Arrays.toString(validDifficultyLevels));
//		
//		double[] nums;
//		
//		double num1 = 5;
//		double num2 = 3;
//		double num3 = num1 + num2;
//		double num4 = num1 - num2;
//		
//		nums = new double[5];
//		//nums = new double[] {num1, num2, num3, num4};
//		
//		nums[0] = num1;
//		nums[1] = num2;
//		nums[2] = num3;
//		nums[3] = num4;
//		
//		System.out.println(Arrays.toString(nums));
//		
//		System.out.println(nums.length);
//		
//		System.out.println(nums[0]);
//		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
//		
//		System.out.println();
//		
//		System.out.println(toString(nums));
//		
//		// comparet two arrays
//		int[] nums1 = {1, 2, 3};
//		int[] nums2 = {1, 2, 3};
//
//		// 1. using ==
//		System.out.println(nums1 == nums2); 			// comparing the reference -> false
//
//		// 2. using
//		System.out.println(Arrays.equals(nums1, nums2)); // comparing the elements -> true
//		
//		int[] nums3 = nums1.clone();
//		System.out.println(Arrays.toString(nums3));
//		
//		int[] nums4 = Arrays.copyOf(nums3, 2);
//		System.out.println(Arrays.toString(nums4));
//		
//		int[] nums5 = Arrays.copyOfRange(nums3, 1, 2);
//		System.out.println(Arrays.toString(nums5));
//		
//		Clock clock1 = new Clock();
//		
//		Clock clock1copy = new Clock(clock1);
//		
//	    int[] values = { 1, 2, 3 };
//
//	    CopyExample copyExample = new CopyExample(values);
//
//	    copyExample.showData();
//	    values[0] = 13;
//	    copyExample.showData();

//		// Sort an array
//		int[] nums = { 1, 6, 3, -2, 5, 0 };
//		// Arrays.sort() is a void method, it direclty modifies the original array
//		// instead of create a new array. If you want to keep the original array, you
//		// should create a copy of the array manually before sorting it.
//		int[] numsCopy = Arrays.copyOf(nums, nums.length);
//
//		// sort the entire array, ascending
////	    Arrays.sort(numsCopy);
////	    System.out.println(Arrays.toString(numsCopy));
//
//		// sort part of the array, ascending
//		Arrays.sort(numsCopy, 1, 4);
//		System.out.println(Arrays.toString(numsCopy));
//
//		int[] nums2 = new int[20];
//		// Arrays.fill() directly modifies the original array
//		Arrays.fill(nums2, 1); // {1, 1, 1}
//		System.out.println(Arrays.toString(nums2));
//
//		// Regular for loop for a String. String only supports regular for loop
//		String str = "hello";
//
//		for (int i = 0; i < str.length(); i++)
//			System.out.print(str.charAt(i));
//
//		System.out.println();
//
//		for (int each : nums) {
//			System.out.print(each + " ");
//		}
//
//		System.out.println();
//		
//		System.out.println(Arrays.toString(str.toCharArray()));
//
//		// convert the string into a char array and then print each element of it
//		for (char c : str.toCharArray())
//			System.out.println(c);
//
//		// convert the string into a char array and then count the number of digits in
//		// it
//		int digitCount = 0;
//		
//		for (char c : str.toCharArray())
//			if (Character.isDigit(c))
//				digitCount++;
		
		int[] nums = {1, 2, 3};

		// increase values of elements in an array by using enhanced-for loop
		// won't work, nums will still be {1, 2, 3}
		for (int num : nums) {
		   num++;      				// num is a local variable, it will not affect the array
		}
		
		System.out.println(Arrays.toString(nums));
		
		// increase values of elements in an array by using regular for loop
		// will work, nums will be {2, 3, 4}
		for (int i = 0; i < nums.length; i++)
		    nums[i]++;				// changes applied on nums
		
		System.out.println(Arrays.toString(nums));
		
		Clock[] clocks = new Clock[3];			// {null, null, null}
		Arrays.fill(clocks, new Clock());		// fill all null by a real object

		Clock[] clocks2 = {new Clock(), new Clock(1, 2, 3), new Clock(2, 3 ,4)};

		Clock[] clocks3;
		Clock c1 = new Clock();
		Clock c2 = new Clock(8, 8, 8);
		Clock c3 = new Clock(9, 9, 9);
		clocks3 = new Clock[]{c1, c2, c3};
		
//		int test = 5;
//		
//		{
//			System.out.println(test);
//			
//			int i = 5;
//		}
//		
//		System.out.println(i);
		
//		Scanner scanner = new Scanner(input);
//		scanner.next()

	}

	public static String toString(double[] nums) {
		String str = "";

		for (int i = 0; i < nums.length; i++) {
			str += String.format("%-5.0f", nums[i]);
		}

		return str;
	}

}
