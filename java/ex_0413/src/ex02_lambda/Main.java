package ex02_lambda;

public class Main {
	public static void main(String[] args) {
		// 1. 구현 클래스를 만들어서 사용하기
		MyFunction mi = new MyFunctionImpl();
		mi.run();
		
		// 2. 익명 클래스 만들기
		MyFunction m = new MyFunction() {
			
			@Override
			public void run() {
				System.out.println("익명 클래스");
			}
		};
		m.run();
		
		// 3. 람다식 사용하기
		MyFunction m2 = () -> {System.out.println("람다식");};
		m2.run();
		
		
		// 람다식 사용 이유
		
		// 1. 코드가 짧아진다
		// 익명 클래스보다 코드를 짧게 작성할 수 있다
		
		// 2. 핵심 로직이 잘 보인다
		// 클래스의 선언, 메서드 선언과 같은 껍데기를 줄이고 
		// 실제로 하고싶은 동작만 보이게 할 수 있다
		
		// 3. 컬렉션 처리에 유용하다
		// 정렬, 필터리으 반복 처리같은 작업에서 자주 사용한다
		
		// 함수는 독립적으로 호출이 가능한 것
		// 메서드는 클래스에 속해있는 함수
		
		// 4. 함수형 프로그래밍 스타일을 일부 사용할 수 있다.
	}
}
