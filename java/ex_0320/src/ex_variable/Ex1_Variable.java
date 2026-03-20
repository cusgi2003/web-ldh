package ex_variable;

public class Ex1_Variable {
	public static void main(String[] args) {
		/*
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("홍길동");
		*/
		
		int x;
		x = 10;
		
		System.out.println(x+1);
		
		x = 55; // 기존의 값을 버리고 새로운 값을 도입할 수 있다

		System.out.println(x);
		
		// 변수 x의 값에 연산을 한 후 다시 대입하면
		// 연산한 값이 유지가 된다
		x = x+1;
		System.out.println(x);
		
		
		
		
	}
}
