import java.util.Random;

public class Exception1 {

	public static void main(String[] args) {
//	    int num = 5;
//	    Random rand = new Random();
//	    int num2 = rand.nextInt(num);           // [0, 1, 2, 3, 4]
//	    int result = 0;
//	    int[] nums = {1, 2, 0, 3};
//
//	    try {
//	        for (int i = 0; i < 10; i++)	// may throw ArithmeticException and ArrayIndexOutOfBoundException
//	            result = num / nums[rand.nextInt(10)];
//	    }
//	    catch (ArrayIndexOutOfBoundsException e) {
//	        result = -1;
//	    }
//	    catch (ArithmeticException e) {
//	        result = 0;
//	    }     catch (Exception e) {						// a handler that mimic the default handler
//	        // exception information
//	        System.out.print(e.getClass() + ": ");
//	        System.out.println(e.getMessage());
//
//	        // exception stact trace
//	        StackTraceElement[] stes = e.getStackTrace();
//
//	        for (StackTraceElement ste : stes)
//	            System.out.println("\t\t at " + ste);
//
//	        // stop the execusion with a special status
//	        // 0 ususally represents normal, all other numbers indicate that there is a problem in the code
//	        // this line is optional, if you remove this line, then the handler will only print without stop the execusion
//	        System.exit(1);
//	    }
//	    
//	    System.out.print(result);

//		System.out.println("*Before the exception*\n");
//		
//		try {
//			System.out.println(5 / 2);
//			
//			int[] myArray = new int[3];
//			
//			myArray[5] = 54;
//			
//		} catch (ArithmeticException e) {
//			System.out.println("Division by zero\n");
//			System.out.println(e.getMessage());
//			
//		} catch (Exception e) {
//			System.out.println("Something went wrong");
//		}
//		
//		System.out.println("*After the exception*\n");

		try {
			m1();
//			m2(); // a method also may throw ArithmeticException
//			m3();
		} catch (ArithmeticException e) {
			System.out.println("Cannot divid by zero");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index ouf of bound");
		}
//		} catch (TwoNumberTheSameException e) {
//			System.out.println("TwoNumberTheSameException caught!");
//		}
	}

	// throws ArithmeticException, IndexOutOfBoundException
	public static void m1() throws ArithmeticException, TwoNumberTheSameException {
        Random rand = new Random();
        int num1 = 2;//rand.nextInt(5);
        int num2 = 2;//rand.nextInt(5);
        if (num1 == num2)
            // throw new TwoNumberTheSameException();  // default constructor with no message
            throw new TwoNumberTheSameException(num1 + "");  // or adding a String as message
        int result = num1 / 0;
        System.out.println();      // Runtime exception: Arithmatic
	}
}
