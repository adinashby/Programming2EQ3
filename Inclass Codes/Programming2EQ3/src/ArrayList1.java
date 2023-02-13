import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		Integer[] myArray = new Integer[5];
		
		ArrayList<Integer> myList = new ArrayList<>();
		
		myArray[0] = 4;
		
		myList.add(53);
		myList.add(42);
		myList.add(11);
		
		//myList.remove(new Integer(42));
		
		
		System.out.println(myList);
		
		ArrayList myList2 = new ArrayList<>();
		
		myList2.add(21);
		myList2.add("hey");
		myList2.add(true);
		
		System.out.println(myList2);
		
		List<Integer> myList3 = Arrays.asList(myArray);
		
		Collections.sort(myList); // sorts the ArrayList
		System.out.println(myList);

		Collections.reverse(myList); // reverses the ArrayList
		System.out.println(myList);
		System.out.println();
		
		ArrayList<ArrayList<Integer>> myList4 = new ArrayList<>();
		
		myList4.add(new ArrayList<Integer>());
		myList4.add(new ArrayList<Integer>());
		
		myList4.get(0).add(5);
		myList4.get(0).add(21);
		
		myList4.get(1).add(125);
		
		System.out.println(myList4);
		
		System.out.println(myList4.size());
		
		System.out.println(myList4.get(1).size());
		
		myList4.get(0).set(0, 99);
		
		System.out.println(myList4);
		
	}

}
