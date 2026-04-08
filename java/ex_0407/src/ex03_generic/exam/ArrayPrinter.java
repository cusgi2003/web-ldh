package ex03_generic.exam;

public class ArrayPrinter {
	// 배열을 외부에서 전달받아 화면에 출력하는 기능을 가진
	// printArray제네릭 작성하기
	public <T> void printArray(T[] arr) {
		for(T t : arr) {
			System.out.println(t);
		}
	}
	
	//Main에서 다음과 같은 배열들을 출력하기
	//String [] name = {"김철수", "이영희", "박민수"};
	//Integer[] nums = {10,20,30};
}
