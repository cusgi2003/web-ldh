package ex01_innerclass.staticclass;

public class Outer {
	int a = 10; // 일반 필드(멤버 변수)
	static int b = 20; // 정적 필드(클래스 변수)
	
	static class Inner{
		// 정적 내부 클래스는 Outer 객체에 연결되어 있지 않기 때문이다
		void print() {
			// System.out.println(a);  오류 
			System.out.println(b);	// 가능
		}
		
		void print(Outer outer) {
			System.out.println(outer.a);
		}
	}
}
