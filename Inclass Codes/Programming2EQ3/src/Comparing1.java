import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.security.sasl.AuthorizeCallback;

public class Comparing1 {

	public static void main(String[] args) {
	    ArrayList<Student> students = new ArrayList<>();
	    
	    students.add(new Student("1", "yi", "wang", 36, 'm'));
	    students.add(new Student("2", "mike", "conna", 18, 'm'));
	    students.add(new Student("3", "jon", "a", 22, 'm'));
	    students.add(new Student("4", "jon", "c", 22, 'f'));
	    students.add(new Student("5", "jon", "b", 22, 'f'));
	    students.add(new Student("6", "jon", "d", 22, 'm'));
	    students.add(new Student("-1", "jon", "d", 22, 'm'));
	    
//	    for(Student student : students) {
//	    	System.out.println(student);
//	    }
//	    
//	    System.out.println("\n");
//	    
//	    Collections.sort(students);
//	    
//	    for(Student student : students) {
//	    	System.out.println(student);
//	    }
	    
	    System.out.println("How do you want to sort the students");
	    System.out.println("1. based on the age");
	    System.out.println("2. based on the name");
	    System.out.println("3. based on the gender");

	    Scanner console = new Scanner(System.in);
	    int choice = console.nextInt();
	    
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("\n");

	    switch (choice) {
	        case 1:
	            Collections.sort(students, new AgeComparator());		// sort based on age
	    }
	    
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

}
