package ex_variable;

public class Ex2_VariableExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y = 5;
		// 변수 x에 들어있는 값과 변수 y에 들어있는 값을 교환하기
		// 필요하다면 변수를 또 만들어도 된다
		System.out.println("x : " + x + ", y : " + y);
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x + ", y : " + y);
		System.out.println("========================");
		
		
		
	}

}
