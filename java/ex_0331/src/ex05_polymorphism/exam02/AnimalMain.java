package ex05_polymorphism.exam02;

abstract class Animal {
	public abstract void sound() ;
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Zoo {
	public void printSound(Animal animal) {
		animal.sound();
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.printSound(new Animal());
		zoo.printSound(new Dog());
		zoo.printSound(new Cat());
	}
}
