package app;

import java.util.Scanner;

import member.Member;
import service.MemberService;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자의 이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		Member member = new Member(name, age);
		MemberService service = new MemberService();
		
		service.register(member);
		service.checkAdult(member);
	}
	
	// 성인인지 판단하는 checkAdult() 메서드 만들기
	
}
