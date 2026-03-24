package ex01_operator;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		int box = 5;
		int ball = 23;
		int result1 = ball/box + (ball%box == 0 ? 0 : 1);
		System.out.println(result1);
		
		// ====================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 값 : \n");
		int input = sc.nextInt();
		
		int result2 = input/box + (input%box == 0 ? 0 : 1);
		System.out.println("필요한 박스의 개수 : " + result2);
	}
}
