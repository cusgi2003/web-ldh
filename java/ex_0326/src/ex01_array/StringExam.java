package ex01_array;

import java.util.Scanner;

public class StringExam {
	public static void main(String[] args) {
		// 연속된 문자를 문자+개수 형태로 압축하기.
		//Ex) aaabbc => a3b2c1
		
		Scanner sc = new Scanner(System.in);
		String scString = sc.next();
		
		int count = 1;
		
		for(int i = 0; i < scString.length(); i++) {
			if((i < scString.length() -1) && (scString.charAt(i) == scString.charAt(i+1))) {
				count++;
				continue;
			} else {
				System.out.print(scString.charAt(i) + "" + count);
				count = 1;
			}
		}
	}
}
