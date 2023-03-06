
public class Cat extends DomesticatedAnimal implements Printable, Drawable {
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

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawAnimal() {
		// TODO Auto-generated method stub
		
	}


}
