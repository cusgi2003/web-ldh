package ex01_operator;

public class Example {
	public static void main(String[] args) {
		int box = 5;
		int ball = 23;
		int result1 = ball/box + (ball%box == 0 ? 0 : 1);
		System.out.println(result1);
		
		// ====================
	}
}
