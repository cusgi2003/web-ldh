package ex01_operator;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		int box = 5;
		int ball = 23;
		int result1 = ball/box + (ball%box == 0 ? 0 : 1);
		System.out.println(result1);
		
		// ===============================
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 값 : \n");
		int input = sc.nextInt();
		
		int result2 = input/box + (input%box == 0 ? 0 : 1);
		int result3 = input % 5 == 0 ? input/5 : input/5 + 1;
		System.out.println("필요한 박스의 개수 : " + result2);
		
		// ===============================
		
		// 사각형의 가로와 세로의 길이를 입력받아
		// 넓이와 둘레 구하기
		int width;
		int length;
		
		System.out.print("입력할 가로의 값 : \n");
		width = sc.nextInt();
		System.out.print("입력할 세로의 값 : \n");
		length = sc.nextInt();
		
		int area = width * length;
		int perimeter = (width + length) * 2;
		
		System.out.printf("넓이의 값 : %d", area);
		System.out.printf("둘레의 값 : %d", perimeter);
		
		System.out.println();
		// ===============================
		
		// 학생은 하루에 일정한 금액의 용돈을 받는다
		// 하루에 받는용돈 : money
		// 날짜 수 : day
		// 총 받은 용돈에서 사용한 금액(used)을 뺀 남은 돈을 
		// 출력하는 코드 작성하기
		
		System.out.print("용돈 : ");
		int money = sc.nextInt();
		
		System.out.print(", 날짜 : ");
		int day = sc.nextInt();
		
		System.out.print(", 사용한 금액 : ");
		int used = sc.nextInt();
		System.out.println();
		
		int result4 = money * day - used;
		System.out.printf("총 남은 금액 : %d", result4);
		
		System.out.println();
		// ===============================
		
		// 국어, 영어, 수학에 대한 점수를 입력
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기
		// 3. 세 과목의 점수가 각각 60점이상이고, 평균이 60점 이상일 떄 합격
		
		float kr;
		float en;
		float math;
		
		System.out.println("국어의 점수 : ");
		kr = sc.nextFloat();
		System.out.println("영어의 점수 : ");
		en = sc.nextFloat();
		System.out.println("수학의 점수 : ");
		math = sc.nextFloat();
		
		float sum = kr + en + math;
		float avg = sum/3;
		System.out.println("총 점 : " + sum);
		System.out.println("평균점수 : " + avg);
		
		String success = (kr >= 60 && en >= 60 && math >= 60) && 
				avg >= 60 ? "합격" : "불합격";
		System.out.println("결과는 " + success + "입니다.");
	}
}
