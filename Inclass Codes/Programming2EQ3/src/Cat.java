
public class Cat extends DomesticatedAnimal {
	String furColor;
	
	public Cat(String furType, boolean isCute, String furColor) {
		super(furType, isCute);
		//super.makeSound();
		this.furColor = furColor;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow");
		doSomething();
	}

	@Override
	public String toString() {
		return "Cat [furColor=" + furColor + ", furType=" + furType + "]";
	}
	
	
}
