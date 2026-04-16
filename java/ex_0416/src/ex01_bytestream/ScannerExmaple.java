package ex01_bytestream;

public class ScannerExmaple {
	public static void main(String[] args) {
		byte[] keboard = new byte[100];
		
		try {
			System.out.print("값 : ");
			
			// 키보드에서 입력을 받을 수 있다
			// System 클래스의 in필드는 키보드 이력을 받기 위한  표준 스트림
			// 문자, 숫자, 파일, 데이터처럼 들어오는 모든 입력을 바이트로 받는다
			// 그걸 나중에 문자열로 해석한다
			System.out.println(keboard);
			
			String s = new String(keboard).trim();
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
