
public interface Printable {
	void printSomething();
	
	default void printAnotherThing() {
		System.out.println("Good morning!");
	}
}
