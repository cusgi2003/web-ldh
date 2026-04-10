package ex02_Iterator.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		// 사용자로부터 여러개의 문자열을 입력받아 List에 저장한다
		// 이후 중복을 제거하고 정렬하여 출력하는 프로그램 작성
		// 입력은 exit 입력시 종료
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("문자열 입력");
		
		while(true) {
			String input = sc.next();
			if(input.equalsIgnoreCase("eixt")) {;
				break;
			}
			list.add(input);
		}
		
		Set<String> set = new HashSet<String>(list);
		List<String> result = new ArrayList<String>();
		
		// 정렬
		Collections.sort(result);
		System.out.println("중복 제거 후 정렬 결과 : " + result);
		
		
		// 학생 이름을 입력받아 List에 저장한다
		// 이미 존재하는 이름이면 추가하지 않고 "이미 존재하는 이름입니다." 메세지를 출력한다
		List<String> students = new ArrayList<String>();
		
		System.out.println("이름 입력 : ");
		while(true) {
			String name = sc.next();
			if(name.equalsIgnoreCase("exit")) {
				break;
			}
			
			if(students.contains(name)) {
				System.out.println("이미 존재하는 이름입니다");
			} else {
				System.out.println(name + "학생 추가");
				students.add(name);
			}
		}
		System.out.println("학생 이름 목록 : " + students);
	}
}
