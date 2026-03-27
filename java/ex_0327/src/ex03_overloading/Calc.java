package ex03_overloading;

public class Calc {
	// 직사각형의 넓이를 구하는 area 메서드를 작성하세요
	// 가로와 세로의 길이는  매개변수를 통해 받는다
	// 넓이는 메서드 내에서 출력하고 종료
	
	public void area(int length, int height) {
		System.out.println("넓이 : " + length*height);
	}
	
	public void area(double length, double height) {
		System.out.println("넓이 : " + length*height);
	}
	
	// 오버로딩해서 정사각형의 넓이를 구하는 메서드 만들기
	// 길이는 매개변수로 받는다
	public int area(int length) {
		return length*length;
	}
	
	public double area(double length) {
		return length*length;
	}
	
	
	
}
