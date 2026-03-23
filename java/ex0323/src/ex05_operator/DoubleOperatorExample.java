package ex05_operator;

public class DoubleOperatorExample {
	public static void main(String[] args) {
		// 산술연산자
		// +, -, *, /,  % 연산자가 존재
		// 곱하기는 x 대신 *를 사용
		// 나누기는 나누기 기호 대신 /, %를 사용한다
		
		byte v1 = 10;
		byte v2 = 4;
		byte v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;	// 모든 피연산자는 int로 변환
//		int result2 = v1 + v2 - v4;
		double result3 = v1/v3;
		
		int result4 = v1%v2;
		System.out.println(result4);
		
		// 산술변환
		// 기본적으로 이항 연산자의 두 피연산자의 타입이 일치해야 한다.
		// 컴퓨너는 서로 다른 타입을 계산하지 못하므로 타입을 맞춰야 한다.
		
	}
}
