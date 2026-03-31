package ex01_overriding;

// 부모 클래스
public class Calculator {
	// 반지름을 외부에서 받아 원의 넓이를 반환하는 araCircle 메서드 작성하기
	// 원의 넓이 : 3.14 * 반지름 * 반지름
	
	public double areaCircle(double radius) {
		System.out.println("calculator 반지름의 길이 : " + radius);
		return (3.14 * radius * radius);
	}
}
