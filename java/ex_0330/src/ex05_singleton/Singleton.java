package ex05_singleton;

public class Singleton {
	// 클래스 내부에서 객체를 생성함
	private static Singleton sigleton = new Singleton();
	
	// private 접근 제한을 갖는 생성자를 선언
	private Singleton() {
		
	}
	
	 public static Singleton getInstance() {
		 return sigleton;
	 }
	
}
