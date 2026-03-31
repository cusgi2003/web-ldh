package ex01_overriding;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal.sound();
		dog.sound();
		cat.sound();
	}
}
