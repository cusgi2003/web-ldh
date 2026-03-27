package ex2_method;

public class Calculator {
	// 게산기 기능이 있는 메서디
	//숫자 2개, 문자열 타입의 연산자
	
	public int getResult(int a, int b, String str) {
		if(str.equals("+")) {
			return a+b;
		} else if(str.equals("-")) {
			return a-b;
		} else if(str.equals("*")) {
			return a*b;
		} else if(str.equals("/")) {
			return a/b;
		} else {
			System.out.println("연산 기호가 올바르지 않습니다");
			return -1;
		}
	}
}
