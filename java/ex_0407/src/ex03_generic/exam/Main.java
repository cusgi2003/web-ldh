package ex03_generic.exam;

public class Main {
	public static void main(String[] args) {
		
		String [] name = {"김철수", "이영희", "박민수"};
		Integer[] nums = {10,20,30};
		ArrayPrinter arrPrint = new ArrayPrinter();
		arrPrint.printArray(name);
		System.out.println();
		arrPrint.printArray(nums);
		
		System.out.println("---------------------");
		
		// 타입 안정성이 떨어지고, 형변환 코드가 많아지고
		// 실수의 발견이 늦어진다
		
		// 제네릭을 사용하게 되면
		// 꺼낼때 형변환이 필요없고, 잘못된 타입을 넣으면 컴파일 오류가 난다
		// 타입마다 변수를 만들어줄 필요가 없어서 재사용성이 크게 증가한다
		// 제네릭 타입변수에 들어갈 수 있는 것은 클래스만 가능하다.
	}
}
