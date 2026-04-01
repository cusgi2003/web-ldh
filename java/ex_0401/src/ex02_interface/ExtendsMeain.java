package ex02_interface;

public class ExtendsMeain {
	public static void main(String[] args) {
		InterfaceImp impl = new InterfaceImp();
		
		// 인터페이스의 타입변환
		// 인터페이스와 구현 크래스 사이에서 발생한다
		
		// 자동 타입변환
		// 구현 객체를 이넡페이스 타입변수에 대입할 때
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		System.out.println();
		
		// 다른 인터페이스를 상속받ㅇㅆ기 때문에 세개의 메서도 전부 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
