import java.util.Random;
import java.util.Scanner;

public class Review1 {

	public static int numberOfReviews = 1;
	private String color = "blue";

	public static void main(String[] args) {
		int myInteger = 5;
		System.out.println(myInteger);

		float myFloat = 1.3f;
		System.out.println(myFloat);

		boolean myBoolean = true;

		System.out.println(Math.min(6, 10));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.round(3.6));
		System.out.println(Math.random());
		System.out.println(Math.PI);

		Random random = new Random();

		System.out.println(random.nextInt(3));
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(5) * 2 + 3);

		// 5, 8, 11, 14, 17

		System.out.println(random.nextInt(5) * 3 + 5);

		// 20, 25, 30, 35

		System.out.println(random.nextInt(4) * 5 + 20);

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please input a word: ");
//		
//		int input = scanner.nextInt();
//		//double input = scanner.nextDouble();
//		String input2 = scanner.next();
//		//String input = scanner.nextLine();
//		
//		System.out.println(input);
//		System.out.println(input2);

		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		// Abc5

		// AND or & or &&
		// true true -> true
		// false true -> false
		// true false -> false
		// false false -> false

		// OR or | or ||
		// true true -> true
		// false true -> true
		// true false -> true
		// false false -> false

		System.out.println("\n\n");
		System.out.println(isPasswordValid("Abc5"));
	
		System.out.println(5 < 7 ? "yes" : "no");
		
		int operation = 6;
		
		switch(operation) {
		case 1:
			System.out.println("withdraw");
			break;
		case 2: 
			System.out.println("deposit");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("display balance");
			break;
		default:
			System.out.println("This is the default");
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(i == 3) {
				// break;
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		String str = "abcde";
	    int i = 0;
	    
//	    while (i < str.length()) {
//	        System.out.println(str.charAt(++i));
//	        System.out.println(i);
//	    }
	    
	    System.out.println();
	    
	    Clock clock1 = new Clock();
	    Clock clock2 = new Clock(17, 53, 6);
	    
	    System.out.println(clock2);
	    
	    System.out.println();
	    
	    int nb = 50;
	    int x;
	    x = nb++ + nb;
	    System.out.println(nb);
	    System.out.println(x);
	}

	public void printColor() {
		System.out.println(color);
		System.out.println(numberOfReviews);
	}

	public static void calculate() {
		// System.out.println(color);
		System.out.println(numberOfReviews);
	}

	public static boolean isPasswordValid(String password) {
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;

		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c))
				upper = true;
			
			if (Character.isLowerCase(c))
				lower = true;
			
			if (Character.isDigit(c))
				digit = true;
		}

		return upper && lower && digit;
	}

}
