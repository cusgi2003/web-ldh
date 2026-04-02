package app;

import pack1.A;
//import pack2.B;
import pack3.C;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.method();
		
//		B b = new B();	module_a 에서 module 파일을 수정하면 에러가 남
//		b.method();		-> 패키지 은닉
		
		C c = new C();
		c.method();
	}
}
