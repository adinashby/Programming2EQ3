import java.security.interfaces.DSAKeyPairGenerator;
import java.util.Objects;

public class Inheritance1 {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		
		Cat cat = new Cat("soft", true, "Gold");
		Dog dog = new Dog();
		
		//animal.makeSound();
		cat.makeSound();
		dog.makeSound();
		
//		cat.furColor = "black";
//		cat.furType = "soft";
		
		System.out.println(cat);
		
		int[] myArray = new int[5];
		
		System.out.println(myArray.toString());
		
		Object myObj = new Object();
		
		System.out.println(myObj);
		
		
		System.out.println(cat.furType);
		System.out.println(cat.isCute);
		System.out.println(cat.furColor);
		
		double num = 3;
		System.out.println(num);
		
		int num2 = 'a';
		System.out.println(num2);
		
		int num3 = (int) 3.14;
		
		Animal animal = new Dog();
		DomesticatedAnimal myDomes = (DomesticatedAnimal) animal;
		
		Animal animal2 = new Animal();
		//DomesticatedAnimal myDomes2 = (DomesticatedAnimal) animal2;
		
		System.out.println(animal instanceof Animal);
		System.out.println(animal2 instanceof Animal);
		System.out.println();
		System.out.println(animal instanceof DomesticatedAnimal);
		System.out.println(animal2 instanceof DomesticatedAnimal);
		System.out.println();
		System.out.println(animal instanceof Dog);
		System.out.println(animal2 instanceof Dog);
	}

}
