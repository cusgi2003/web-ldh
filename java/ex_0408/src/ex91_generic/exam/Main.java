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
		
		AnimalHospital<Dog> dogHospital = new AnimalHospital<Dog>(new Dog());
		AnimalHospital<Cat> catHospital = new AnimalHospital<Cat>(new Cat());
		
		// 동물병원은 동물만 다루는 곳인데
		// 문자열이나 숫자 다른 객체가 들어오면 이상해진다
		dogHospital.treat();
		catHospital.treat();
		
		
		
		
		
		
		
		
		
		
		System.out.println("--------------");
		
		MemberResponse<Member> mr = new MemberResponse<>
			(true, "회원 조회 성공", new Member("홍길동", 27));
		System.out.println("성공 여부 : " + mr.isSuccess());
		System.out.println("메시지 : " + mr.getMessage());
		System.out.println("이름 : " + mr.getData().getName());
		System.out.println("나이 : " + mr.getData().getAge());
	}
}
