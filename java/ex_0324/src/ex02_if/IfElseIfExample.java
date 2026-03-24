package ex02_if;

public class IfElseIfExample {
	public static void main(String[] args) {
		int score = 75;
		
		// 100 	~ 90 	: A
		// 89 	~ 80 	: B
		// 79 	~ 70 	: C
		// 69 	~ 60 	: D
		// 59 	~ 0 	: F
		
		if(score >= 90) {
			System.out.println("A");
		} else if(90 > score && score>= 80) {
			System.out.println("B");
		} else if(80 > score && score >= 70) {
			System.out.println("C");
		}else if(70 > score && score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
