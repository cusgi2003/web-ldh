package ex01_overriding;

public class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("고양이가 야옹 웁니다");
	}
}
