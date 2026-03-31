package ex01_overriding;

public class ComputerMain {
	public static void main(String[] args) {
		double radius = 5.0;
		
		Calculator calc = new Calculator();
		System.out.println(calc.areaCircle(radius));
		
		// 컴퓨터 객체 만들어서 오버라이딩 메서드 호출하기
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(radius));
		
		// 오버라이딩의 경우 상속 관계에서만 사용할 수 있다.
	}
}
