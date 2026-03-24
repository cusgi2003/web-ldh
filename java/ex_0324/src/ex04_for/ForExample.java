package ex04_for;

public class ForExample {
	public static void main(String[] args) {
		// 지역 변수 : 특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
		// 안에서 만든 변수는 바깥에서 사용할 수 없지만,
		// 밖에서 만든 변수는 안쪽에서 사용할 수 있다.
		
		int i;
		for(i = 1; i <= 3; i++) {
			System.out.println(i + " ");
		}
		System.out.println("외부 i의 값 : " + i);
		
		System.out.println("===========================");
		
		// 5부터 1까지 출력
		for(i =5; i>=1; i--) {
			System.out.println(i);
		}
	}
}
