package ex02_method;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : \n");
		int first = sc.nextInt();
		
		System.out.print("첫번째 숫자 입력 : \n");
		int second = sc.nextInt();
		
		System.out.print("연산기호 입력 (+, -, *, /) : \n");
		String calcurator = sc.next();
		
		int result = calc.getResult(first, second, calcurator);
		
		System.out.println("결과 값 : " + result);
	}
}
