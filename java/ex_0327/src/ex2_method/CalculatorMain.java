package ex2_method;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println("숫자 입력");
		
		int result = calc.getResult(10, 50, "+");
		System.out.println(result);
	}
}
