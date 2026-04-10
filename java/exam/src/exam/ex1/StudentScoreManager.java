package exam.ex1;

import java.util.Scanner;

public class StudentScoreManager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 이름 : ");
		String studentName = sc.next();
		
		System.out.print("Java 점수 : ");
		int javaScore = sc.nextInt();
		
		System.out.print("DB 점수 : ");
		int dbScore = sc.nextInt();
		
		System.out.print("HTML 점수 : ");
		int htmlScore = sc.nextInt();
		
		System.out.println("----------------");
		
		int sum = javaScore + dbScore + htmlScore;
		
		double average = sum/3;
		
		String result = (average >= 60 ? "합격" : "불합격");
		
		System.out.println("이름 : " + studentName);
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + average + "점");
		System.out.println("결과 : " + result);
		
	}
}
