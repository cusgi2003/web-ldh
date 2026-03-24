package ex02_if;

public class IfElseIfExample {
	public static void main(String[] args) {
		int score = 75;
		
		// 100 	~ 90 	: A
		// 89 	~ 80 	: B
		// 79 	~ 70 	: C
		// 69 	~ 60 	: D
		// 59 	~ 0 	: F
		
		// 0보다 작은 수가 들어왔을 때 "다시 입력해주세요" 출력
		if(score < 0 || score > 100) {
			System.out.println("100 이하, 0 이상의 숫자만 입력해주세요");
		} else {
			if(score >= 90) {
				System.out.println("A");
			} else if(score>= 80) {
				System.out.println("B");
			} else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}
