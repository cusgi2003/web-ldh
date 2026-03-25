package ex06_string;

public class StringExample {
	public static void main(String[] args) {
		// String
		// 문자들의 집합을 의미
		
		// 묵시적 객체 생성
		// 같은 문자열이나 객체를 공유
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		if(s1 == s2) {
			System.out.println("s1과 s2의 주소가 같습니다");
		}
		
		
		// 명시적 객체 생성
		// new를 통해 생성하는 객체
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		
		if(s3 == s4) {
			System.out.println("s3과 s4의 주소는 다릅니다.");
		}
		
		// String은 클래스
		// 클래스 안에는 자주 사용하는 기능들이 메서드 형태로 정의되어 있다.
		
		// 문자열에서 추출하기
		// charAt(index))
		// index : 컴퓨터가 숫자를 세는 방식
		
		String subject = "자바 프로그래밍";
		
		char charValue = subject.charAt(3);
		System.out.println(charValue);
		
		String ssn = "9201231230123";
		// 이 사람이 남자면 "남자, 여자면 "여자"라고 출력
		char gender = ssn.charAt(6);
		
		String result = switch(gender) {
		case '1', '3' -> "남자";
		case '2', '4' -> "여자";
		default -> "잘못 입력하셨습니다";
		};
		System.out.println(result);
		
		// 문자열의 길이 측정
		// length
		int length = subject.length();
		System.out.println("문자열의 길이 : " + length);
		
		// 특정 문자열을 대체
		// replace("기존", "새로운");
		String newStr = subject.replace("자바", "JAVA");
		System.out.println(newStr);
		
		// 문자열 잘라내기
		// substring(시작 index, 끝 index)
		String str = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str.substring(2,9));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
