package ex04_classCasting;

class Parent{
	public void method1() {
		System.out.println("부모 메서드 1");
	}
	
	public void method2() {
		System.out.println("부모 메서드 2");
	}
}

class Child extends Parent {
	
	public int x;

	@Override
    public void method1() {
        System.out.println("자식 메서드 2");
    }
	
	public void method3() {
		System.out.println("자식 메서드 3");
	}
}



public class UpCastingExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2(); // 부모타입으로 변환해도 오버라이딩된 메서드가 호출됨
//		parent.method3(); // 자식클래스에 선언된 메서드를 호출하는 것은 불가능
		
		// 자식 객체를 부모타입으로 변환하면
		// 자식클래스에 정의한 맴버(필드, 메서드)를 사용할 수 없다
		
		((Child)parent).method3(); // parent를 임스로 자식타입으로 변환
		
		Child c2 = (Child)parent;
		c2.x = 100;
	}
}
