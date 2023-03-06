import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextIInput1 {
	
	static String path = "test.txt";
	static File file = new File(path);
	static ArrayList<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		readData();
		
		Student newStudent = new Student("4", "Sharif", "A", 18, 'm');
		
		students.add(newStudent);
		
		students.get(0).fname = "Tony";
		
		writeData();
		
	}

	public static void readData() {

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNext()) {
				String[] each = scanner.nextLine().split(",");

				students.add(new Student(each[0], each[1], each[2], Integer.parseInt(each[3]), each[4].charAt(0)));

//				System.out.println(each[0]);
//				System.out.println(each[1]);
//				System.out.println(each[2]);
//				System.out.println(each[3]);

				// System.out.println(each);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

//		System.out.println(students);

	}
	
	public static void writeData() {
		try (FileWriter fw = new FileWriter("test2.txt")) {		// appending mode
		    
			for(int i = 0; i < students.size(); i++) {
		    	fw.write(students.get(i).id + "," + students.get(i).fname +
		    			"," + students.get(i).lname + "," +
		    			students.get(i).age + "," + students.get(i).gender);
		    	fw.write("\n");
		    
			}
		} catch (IOException e) {
		    System.out.println("Fail to write to the file");
		}
	}

}
