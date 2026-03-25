package ex02_while;

import java.util.Scanner;

public class DoWhilleExample {
	public static void main(String[] args) {
//		System.out.println("메세지를 입력하세요");
//		System.out.println("프로그램을 종료하려면 q를 입력하세요");
//		
		Scanner sc = new Scanner(System.in);
//		
//		String inputString;
//		
//		do {
//			System.out.print(">");
//			inputString = sc.nextLine();
//			System.out.println(inputString);
//		} while(!inputString.equals("q"));
		
		System.out.println("============================");
		// 사용자가 비밀번호를 입력한다
		// 비밀번호가 "1234"와 같을때 까지 계속 입력받는다.
		// 단, 5번 틀리면 "접속 차단" 출력 후 종료
		// 성공하면 "로그인 성공" 출력하기
		String password;
		int count = 0;
		
		do {
			System.out.print("비밀번호 입력 : ");
			password =sc.nextLine();
			count++;
			
			if(password.equals("1234")) {
				System.out.println("로그인 성공");
			} else if(count ==5) {
				System.out.println("접속 차단");
			}
			
		} while(!(password.equals("1234") && count < 5));
		
		// 정수를 입력받는다
		// 입력받은 수를 뒤집어서 출력하기
		// 1234 -> 4321
		
		int number;
		String inputData;
		do {
			System.out.print("정수 입력 : ");
			number = sc.nextInt();
			
			if(number != 0) {
				int temp = number;
				int reversed = 0;
				
				while(temp != 0) {
					int digit = temp % 10;
					reversed = reversed * 10 + digit;
					temp /= 10;
				}
				System.out.println("결과 : " + reversed);
			}
			
		} while(number != 0);
		
		
		
		
		
		
		
		
	}
}
