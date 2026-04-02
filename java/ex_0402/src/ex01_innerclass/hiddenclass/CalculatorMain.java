package ex01_innerclass.hiddenclass;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator() {
			
			// 접근제한자를 부모보다 좁게 줄일 수 없다
			@Override
			public void add(int x, int y) {
				System.out.println("결과 : " + (x+y));
					
			}
				
		};
		
		calc.add(1,2);
	}
	
}
