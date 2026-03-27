package ex04_construcor;

public class KoreanExample {
	public static void main(String[] args) {
		// 생성자
		// 메모리에 객체를 올리는 역할
		// 객체의 필드를 초기화 해주는 역할
		Korean korean = new Korean("박자다", "001010");
		
		korean.printInfo();
		// 생성자의 매개변수 이름을 n과 s를 사용했다 
		// 객체를 만들 때 어떤 내용을 넣어야하는지 직관적이지 않다.
		// 가능한 초기화 시킬 필드명과 동일한 이름을 사용하는 것이 좋다
	}
}
