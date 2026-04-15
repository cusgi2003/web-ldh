package ex02_file.exam;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File f = new File("uploads");
		
		// 1. 폴더가 없으면 생성
		if(!f.exists()) {
			boolean created = f.mkdirs();
			if(created) {
				System.out.println("uploads 폴더가 없어 생성했습니다.");
			} else {
				System.out.println("uploads 폴더 생성을 실패했습니다");
				return;
			}
		}
		// 2. 폴더인지 확인
		if(f.isDirectory()) {
			System.out.println("파일입니다");
		} else {
			System.out.println("파일이 아닙니다");
			return;
		}
		// 3. 내부 목록 조회
		File[] list = f.listFiles();
		if(list != null) {
			for(File item : list) {
				if(item.isDirectory()) {
					System.out.println("[DIR] " + item.getName());
				} else {
					System.out.println("[FILE] " + item.getName());
				}
			}
		}
		System.out.println("전체 개수 : " + list.length);
	}
}
