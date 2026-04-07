package ex02_annotation.standard;

public class Parent {
	public void method() {
		
	}
	
	class Child extends Parent {
		@Override
		// 부모클래스의 메서드 재정의
		public void method() {
			super.method();
		}
	}
}
