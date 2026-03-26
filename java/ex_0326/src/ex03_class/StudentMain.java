package ex03_class;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student("이동현", 23, 85);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력 하세요");
		String name = sc.next();
		
	}
}
