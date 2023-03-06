import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize1 {

	public static void main(String[] args) {
		String path = "test3.ser";
		
		Student myStudent;
		
		try (FileInputStream fis = new FileInputStream(path)) {
		   
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    
		    myStudent = (Student) ois.readObject();
		    
		    System.out.println(myStudent);
		    
		} catch (Exception e) {
			System.out.println("Could not Deserialize");
			
		}

	}

}
