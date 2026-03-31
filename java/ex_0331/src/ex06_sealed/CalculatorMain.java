package ex06_sealed;

class Calculator {
	static int n1;
	static int n2;
	
	public int getResult(int n1, int n2) {
		return -1;
	}
		
}

class CalPlus extends Calculator{
	@Override
	public int getResult(int n1, int n2) {
		System.out.println("결과 : " + (n1 + n2));
		return n1 + n2;
	}
}

class CalMinus extends Calculator{
	@Override
	public int getResult(int n1, int n2) {
		System.out.println("결과 : " + (n1 - n2));
		return n1 - n2;
	}
}

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calPlus = new CalPlus();
		Calculator calMinus = new CalMinus();
		
		calPlus.getResult(10, 20);
		calMinus.getResult(20, 10);
	}
	
}