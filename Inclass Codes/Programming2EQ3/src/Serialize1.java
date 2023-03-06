import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize1 {

	public static void main(String[] args) {
		String path = "test3.ser";
		
		try (FileOutputStream fos = new FileOutputStream(path)) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Student newStudent = new Student("5", "Tristan", "Tat", 30, 'm');
			
			oos.writeObject(newStudent);
			
		} catch (Exception e) {
			
		}

	}

}
