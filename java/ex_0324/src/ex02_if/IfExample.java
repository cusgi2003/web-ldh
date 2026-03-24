package ex02_if;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		if(score >= 90){
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score <= 90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다.");
			
		}
		
		
		// 정수 하나를 입력받아서 짝수면 짝수, 홀수면 홀수를 출력하는 코드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int input = sc.nextInt();
		if(input % 2 == 0) {
			System.out.println("입력한 값은 짝수입니다");
		} else {
			System.out.println("입력한 값은 홀수입니다");
		}
		
		
		// 사용자가 입력한 비밀번호가 맞는지 확인하기
		// 키보드에서 비밀번호를 입력받는다
		// 비밀번호 : 1234
		// 입력한 비밀번호와 일치하면 "로그인 성공"
		// 일치하지 않으면 "비밀번호가 일치하지 않습니다"
		
		System.out.println("비밀번호를 입력하세요");
		int inputPass = sc.nextInt();
		System.out.println("비밀번호 설정 완료, 비밀번호 : " + inputPass);
		
		System.out.println("비밀번호 일치 확인");
		int password = sc.nextInt();
		if(inputPass == password) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("입력한 비밀번호 : " + password);
		}
		
		
	}
}

