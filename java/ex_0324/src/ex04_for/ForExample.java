package ex04_for;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		// 지역 변수 : 특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
		// 안에서 만든 변수는 바깥에서 사용할 수 없지만,
		// 밖에서 만든 변수는 안쪽에서 사용할 수 있다.
		

		for(int i = 1; i <= 3; i++) {
			System.out.println(i + " ");
		}
//		System.out.println("외부 i의 값 : " + i);
		
		System.out.println("===========================");
		
		// 5부터 1까지 출력
		for(int i =5; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("===========================");
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 총합 : " + sum);
		
		System.out.println("===========================");
		
		// 1부터 10까지 3의 배수만 출력하는 for문 작성하기
		for(int i = 1; i <= 10; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n===========================");
		
		// 1부터 20까지 홀수만 출력
		for(int i = 1; i <= 20; i++) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n===========================");
		
		// 정수형 변수를 하나 초기화 한다
		// 해당 정수에 해당하는 구구단 출력하기
		int x = 3;
		for(int i = 1; i < 10; i++) {
			System.out.println(x + " * " +  i + " = " + x*i);
		}
		System.out.println("\n===========================");
		
		// 정수 하나를 입력받고
		// 1부터 입력받은 정수까지의 총 합 구하기
		// Ex) input : 5 -> 1 ~ 5까지의 총합인 15를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		int inputSum = 0;
		
		for(int i=1; i <= input; i++) {
			inputSum += i;
		}
		System.out.println("\n입력받은 수 : "+ input + ", 합계 : "+inputSum);
		
		System.out.println("===========================");
		
		// 10개의 정수를 입력받고, 그 수 중에 짝수가 몇개인지 구하기
		int res = 0;
		for(int i=0; i<10; i++) {
			System.out.println("정수 입력 : ");
			int resInt = sc.nextInt();
			if(resInt %2 == 0) {
				res++;
			}
		}
		System.out.println("짝수의 개수 : " + res);
		
		System.out.println("===========================");
	
	}
}
