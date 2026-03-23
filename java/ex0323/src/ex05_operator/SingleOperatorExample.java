package ex05_operator;

public class SingleOperatorExample {

	public static void main(String[] args) {
		// 부호를 결정하는 연산자
		int x = -100;
		x = -x;
		System.out.println("x의 값 : " + x);
		
		// 증감연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		
		// 전위연산
		int a = 5;
		System.out.println(++a);
		
		// 후위연산
		// 연산자가 피연산자 뒤에 오는 연산
		// 사용을 먼저하고 연산이 나중에 이루어진다
		int b = 5;
		System.out.println(b++);
		
		// 증감연산자 ++x => x = x+1
		x = 5;
		int result = ++x + x++; // 12
		System.out.println(result); // result : 12
		System.out.println(x);
		
		System.out.println("=================");
		
		x = 2;
		int y = 3;
		int z = x++ + ++y;
		// x, y, z의 값 구하기
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("=================");
		
		// 논리 부정 연산자
		// !논리형 데이터
		
		// true => false
		// false => true
		boolean isOn = true;
		System.out.println(!isOn);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
