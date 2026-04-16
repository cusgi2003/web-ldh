package ex02_charstream;

import java.io.FileReader;

public class Example {
public static void main(String[] args) {
	// test.txt 파일에 아무 내용이나 적는다
	// 내용을 읽어와서 영어 대문자와 소문자가 몇개 있는지
	// 각각 출력하기
	
	// Ex)
	// 대문자 : 7
	// 소문자 : 22
	
	try(FileReader fr = new FileReader("test.txt")){
		int large = 0;
		int small = 0;
		
		int code = 0;
		while((code = fr.read()) != -1) {
			char ch = (char)code;
			if('A' <= code && code <= 'Z') {
				large++;
			} else if('a' <= code && code <= 'z') {
				small++;
			}
		}
		System.out.println("대문자 : " + large);
		System.out.println("소문자 : " + small);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
