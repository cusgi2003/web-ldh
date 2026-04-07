package ex03_generic;

public class Main {
	public static void main(String[] args) {
		GenEx<String> v1 = new GenEx<String>();
		
		v1.setValue("java");
		
		System.out.println(v1.getValue());
		
		// 제네릭 타입이 정수인 객체 v2
		//값 넣고 출력하기
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(20);
		System.out.println(v2.getValue());
		
		
		// 제네릭 타입이 문자형은 객체 v3
		// 갑 세팅하고 출력
		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('c');
		System.out.println(v3.getValue());
	}
}
