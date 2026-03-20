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
		
		// 대입은 필요한 만큼 할 수 있다
		
		// 선언과 동시에 값을 대입할 수 있다
		int y = 30;
		
		// 변수는 출력문이나 연산식에 사용되어 값을
		// 활용할 수 있다
		
		System.out.println("================");
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		// 총 몇분인지 구하기
		int totalMinute = hour*60 + minute;
		System.out.println("몇 분 : " + totalMinute + "분");
		System.out.println("================");

		// 변수는 또 다른 변수에 대입되어 메모리 간에 값을 
		// 복사할 수 있다
		
		int a = 3;
		int b = a;
		
		System.out.println("a : " + a + ", b: " + b);
		
		
	}
}
