package ex03_Protected.package2;

import ex03_Protected.package1.A;

public class C {
	public void method() {
//		A a = new A();
		// C클래스는 A 패키지와 다른 패키지에 있기 때문에
		// A 클래스의 protected 필드, 생성자, 메서드에 접근할 수 없다
	}

}
