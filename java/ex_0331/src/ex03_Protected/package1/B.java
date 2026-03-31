package ex03_Protected.package1;

public class B {
	public void method() {
		// B 클래스는 A 클래스와 동일한 패키지 안에 있기 때문에
		// protected 로 선언된 필드, 생성자, 메서드에 접근이 가능하다
		A a = new A();
		a.field = "value";
		a.method();
	}
}
