
public class Recursion1 {

	public static void main(String[] args) {
		printInfo(5);
		
		System.out.println(sumRecursion(5));

	}
	
	public static void printInfo(int num) {
//	    for (int i = 0; i < num; i++)
//	        System.out.println("Hello");
		
		if(num == 0) {
			return;
		}
		
		printInfo(num - 1);
		
		System.out.println("Hello " + num);
	}
	
	//sum(5) -> sum(4) + 4
	public static int sumRecursion(int num) {
	    // base case
	    if (num == 0)
	        return 0;

	    // general pattern
	    return sumRecursion(num - 1) + num - 1;
	}

}
