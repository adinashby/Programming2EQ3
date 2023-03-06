import java.util.Objects;

public abstract class Animal  {
	String furType;
	
	public Animal() {
		
	}
	
	public Animal(String furType) {
		this.furType = furType;
	}
	
	public abstract void makeSound();
	
	public void doSomething() {
		System.out.println("I'm doing smth");
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		
		hash = 25 * hash + Objects.hashCode(this.furType);
		
		return hash;
		// 964128
		// 964964
	}
}
