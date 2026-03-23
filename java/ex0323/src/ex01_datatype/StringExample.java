package ex01_datatype;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "홍길동";
		
		System.out.println(s1);
		System.out.println("홍길동");
		
		// 데이터를 변수에 넣어서 사용하는 이유
		// 데이터를 저장해두고, 재사용하기 위함
		
		// 이스케이프 문자
		// 문자열 안에 특수한 기능을 수행하기 위한 문자
		System.out.println("안녕하세요 \"홍길동\" 입니다.");
		
		// \(백슬래시) 가 붙으면 " 이 문자는 특별한 의미로 처리하라 " 
		// \n : 줄바꿈
		System.out.println("hello\nworld");
		// \t : 탭 1개만큼 들여쓰기
		System.out.println("hello\tworld");
		// \" : 큰따옴표 출력
		// \' : 작은 따옴표 출력
		// \\ : 백슬래시 출력
		
		// java13부터는 텍스트블록 문법을 제공한다.
		
	}
}
