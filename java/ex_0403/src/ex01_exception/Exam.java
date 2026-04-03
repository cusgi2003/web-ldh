package ex01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 키보드에서 정수를 입력받고, 정수 이외의 값이 입력되면
		// "정수만 입력가능"이라는 메세지 출력		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		try {
			System.out.println("정수 입력 : ");
			num = sc.nextInt();
		} catch (Exception e) {
			System.out.println("정수만 입력가능");
		}
		
		System.out.println("========================");
		
		String [] fruits = {"사과", "바나나", "포도", "복숭아"};
		// 인덱스를 입력
		// 해당위치의 과일을 출력
		// 숫자가 아닌 값을 입력하면 "숫자를 입력해야합니다"
		// 범위를 벗어난 인덱스를 입력하면 "존재하지 않는 인덱스입니다" 출력하기
		try {
			System.out.println("숫자 입력 : ");
			num = sc.nextInt();
			System.out.println("해당숫자의 과일 : " + fruits[num]);	
		} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해야합니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스입니다" + e.getMessage());
		}
		
	}
}
