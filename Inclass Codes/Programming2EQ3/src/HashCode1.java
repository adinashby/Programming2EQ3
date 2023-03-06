import java.util.Objects;

public class HashCode1 {

	public static void main(String[] args) {
		// input = { "blue", "green", "red", "blue", "white" }
		// set = { "blue", "green", "red", "while" }
		
		// "blue".equals("while") -> false
		// author1.equals(newAuthor) -> ?
		// 98248 == 59655 -> false
		
		Objects.hashCode(21);
	}

}
