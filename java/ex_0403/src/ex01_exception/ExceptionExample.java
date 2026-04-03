package ex01_exception;

public class ExceptionExample {
	public static void main(String[] args) {
		// NullPointerException
		// 참조변수에 null이 들어가 있는데 필드나 메서드를 사용하려고 할 때
		// 발생하는 에외
		int[] arrays = null;
		System.out.println(arrays[0]);
		
		// NumberFormatException
		// 잘못된 문자열을 숫자로 형변환할 때 발생
		
		String str01 = "11.2";
		int num01 = Integer.parseInt(str01);
	}
}
