package ex05_polymorphism.exam02;

public class AnimalMain {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.printSound(new Animal());
		zoo.printSound(new Dog());
		zoo.printSound(new Cat());
	}
}
