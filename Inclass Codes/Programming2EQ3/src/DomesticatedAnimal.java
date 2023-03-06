
public abstract class DomesticatedAnimal extends Animal {
	boolean isCute;
	
	public DomesticatedAnimal() {
		
	}
	
	public DomesticatedAnimal(String furType, boolean isCute) {
		super(furType);
		this.isCute = isCute;
	}
}
