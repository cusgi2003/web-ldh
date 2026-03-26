package ex03_class;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student("이동현", 23, 85);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력 하세요");
		String name = sc.next();
		System.out.println("나이를 입력 하세요");
		int age = sc.nextInt();
		System.out.println("성적을 입력 하세요");
		int score = sc.nextInt();
		
		Student inputStudent = new Student(name, age, score);
		
		String[][] strStudent = new String[3][];
		for
	}
}
