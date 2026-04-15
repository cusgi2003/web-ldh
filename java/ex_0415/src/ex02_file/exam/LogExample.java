package ex02_file.exam;

import java.io.File;

public class LogExample {
	public static void main(String[] args) {
		// logs 폴더를 나타내는 File 만들기
		File f = new File("logs");
		// 폴더가 존재하지 않으면 "logs폴더가 없습니다." 출력하고 종료하기
		if(!f.exists()) {
			System.out.println("logs 폴더가 없습니다");
			return;
		} else {
			System.out.println("logs 폴더를 확인했습니다.");
		}
		// logs폴더 안의 파일 중 확장자가 .log인 파일만 찾기
		
		File dir = new File("logs");
		File[] logFiles = dir.listFiles((d, name) -> name.endsWith(".log"));
		
		// .log파일의 이름과 크기를 바이트 단위로 출력하기
		
		int count = 0;
		int total = 0;
		if(logFiles != null && logFiles.length > 0) {
			for(File log : logFiles) {
				System.out.println(log.getName() + " - " + log.length() + "byte");
				count++;
				total += log.length();
			}
		}
		// 마지막에 .log파일 개수와 전체 용량 합계를 출력하기
		System.out.println(".log 파일 개수 : " + count);
		System.out.println("전체 용량 : " + total + "byte");
		// 출력예시
		// error.log -> 1200byte
		// access.log -> 3400byte
		// system.log -> 800byte
		//.log파일 개수 : 3
		// 전체 용량 : 5400byte
	}
}
