package sub6;

public class Main {
	public static void main(String[] args) {
		Pet dog = new Dog();
		Pet cat = new Cat();
		
		printSound(dog);
		printSound(cat);
	}
	public static void printSound(Pet pet) {
		pet.makeSound();
	}
}
