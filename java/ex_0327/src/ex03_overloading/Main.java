package ex03_overloading;

public class Main {
	public static void main(String[] args) {
		OverloadingExample over = new OverloadingExample();
		Calc cal = new Calc();
		
		// 메서드 오브로딩의 장점
		// 같은 이름으로 여러가지 타입의 매개값을 처리할 수 있다
		int result = over.plus(1, 2);
		double result2 = over.plus(1.0, 2.0);
		
		System.out.println(result);
		System.out.println(result2);
		
		cal.area(5, 2);
	}
}
