package ex91_generic.exam;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		GenericBox<String> generic1 = new GenericBox<>();
		generic1.setItem("사과");
		System.out.println(generic1.getItem());
		
		GenericBox<Integer> generic2 = new GenericBox<>();
		generic2.setItem(100);
		System.out.println(generic2.getItem());
		
		System.out.println("--------------");
		
		MemberResponse<Member> mr = new MemberResponse<>
			(true, "회원 조회 성공", new Member("홍길동", 27));
		System.out.println("성공 여부 : " + mr.isSuccess());
		System.out.println("메시지 : " + mr.getMessage());
		System.out.println("이름 : " + mr.getData().getName());
		System.out.println("나이 : " + mr.getData().getAge());
	}
}
