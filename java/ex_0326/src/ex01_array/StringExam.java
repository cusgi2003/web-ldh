package ex01_array;

import java.util.Scanner;

public class StringExam {
	public static void main(String[] args) {
		// 연속된 문자를 문자+개수 형태로 압축하기.
		//Ex) aaabbc => a3b2c1
		
		System.out.print("입력 받을 문자 : ");
		Scanner sc = new Scanner(System.in);
		String scString = sc.next();
		
		int count = 1;		// 문자 개수를 확인해주는  변수
		
		String result = "";	// 결과 값을 저장할 함수
		
		for(int i = 0; i < scString.length(); i++) {
			if((i < scString.length() -1) && (scString.charAt(i) == scString.charAt(i+1))) {
				count++;
				continue;
			} else {
				result += scString.charAt(i) + "" + count;
				count = 1;
			}
		}
		System.out.println("결과 : " + result);
	}
}
