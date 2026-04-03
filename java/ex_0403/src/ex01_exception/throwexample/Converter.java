package ex01_exception.throwexample;

public class Converter{
	// toInt(String str) 메서드
	// 	문자열을 정수로 반환
	//	예외처리하지 않고 떠넘기기
	// Main클래스에  문자열 입력, Converter객체 호출
	
	public int toInt(String str) throws Exception{
		return Integer.parseInt(str);
	}
}
