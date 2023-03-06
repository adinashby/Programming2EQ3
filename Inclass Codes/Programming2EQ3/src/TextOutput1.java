import java.io.FileWriter;
import java.io.IOException;

public class TextOutput1 {

	public static void main(String[] args) {
		String path = "/Users/adinashby/Desktop/test2.txt";
		
		try (FileWriter fw = new FileWriter(path, true)) {		// appending mode
		    fw.write("\nHi");
		} catch (IOException e) {
		    System.out.println("Fail to write to the file");
		}
		
	}

}
