package ex05_polymorphism.exam02;

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

public class Animal {
	public void sound() {
		System.out.println("동물이 운다");
	}
}
