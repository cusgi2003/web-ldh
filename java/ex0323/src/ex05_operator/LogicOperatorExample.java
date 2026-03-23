package ex05_operator;

public class LogicOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		boolean result = x >= 10 && y == 10;
		System.out.println("result : " + result);
		
		// 앞이 False면 뒤는 연산하지 않는다
		result = (x-y) >= 10 && (++y) == 5;
		System.out.println(y);
		
		// 앞이 True면 뒤는 연산하지 않는다
		result = (x-y) <= 10 || (++y) == 5;
		System.out.println(result);
		
		// 비트논리연산자
		// 기능은 논리연산자와 같지만 bit단위(2진수)의 연산만 가능하다
		// 피연산자가 1,0이라는 것과 산출 결과가 1, 0이라는 점이 특징이다
		// 1은 true, 0은 false라고 생각하면 논리연산자와 차이는 없다

		// & 논리곱		: 둘 다 1이면 1, 아니면 0
		// | 논리합		: 둘 중 하나라도 1이면 1, 아니면 0
		// ^ 베타적 논리합	: 두 항이 다르면 1, 같으면 0
		// ~ 부정			: 1을 0으로, 0을 1으로 연산
	}

}
