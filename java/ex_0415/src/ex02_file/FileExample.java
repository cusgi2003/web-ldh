package ex02_file;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {
		// 메모장까지의 경로
		String path = "C:\\Users\\adminn\\Desktop\\web-ldh\\test.txt";
		
		// 준비된 경로로 File 객체를 생성
		// File 클래스
		// 자바에서 파일과 디렉터리(폴더)를 다루기 위한 클래스
		File f = new File(path);
		
		// 주요 메서드
		// getName();
		// 파일명 또는 마지막 경로명을 반환한다
		System.out.println(f.getName());
		
		// getPath()
		// 생성할 때 넣은 경로를 반환
		System.out.println(f.getPath());
		
		// getAbsolutePath()
		// 절대경로로 반환
		System.out.println(f.getAbsolutePath());
		
		// 절대 경로
		// 운영체제 기준으로 전체 위치가 명확한 경로
		
		// 상대 경로
		// 현재 프로그램 실행위치를 기준으로 한 경로
		// 상재경로는 편하지만, 프로그램을 어디서 실행하느냐에 따라
		// 기준 위치가 달랃진다
		// File f2 = new File("../text.gxr);
		
		
		// exist()
		//파일이나 폴더가 실제로 존재하는지 확인
		if(f.exists()) {
			System.out.println("존재한다");
		} else {
			System.out.println("존재하지 않는다");
		 }
		
		
		//isFile()
		// 최종목적지가 파일인지 확인
		if(f.isFile()) {
			System.out.println("파일입니다");
		} else {
			System.out.println("파일이 아닙니다");
		}
		
		
		// isDirectory()
		// 최종 목적지가 폴더인지 확인
		if(f.isDirectory()) {
			System.out.println("폴더입니다");
		} else {
			System.out.println("폴더가 아닙니다");
		}
		
		
		// length()
		// 파일 크기를 바이트 단위로 반환한다
		System.out.println("파일 크기 : " + f.length());
		
		
		// lastModified();
		// 마지막 수정 시간을 밀리초(long)로 반환한다
		System.out.println(f.lastModified());
		
		
		// createNewFile()
		// 실제 빈 파일을 생성한다
		// 이미 있으면 false를 반환한다
		
		File f2 = new File("text.txt");
		try {
			boolean result = f.createNewFile();
			System.out.println(result ? "파일 생성 성공" : "이미 파일이 존재함");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// mkdir()
		// 폴더를 생성해준다
		File dir = new File("myFolder");
		boolean result = dir.mkdir();
		if(result) {
			System.out.println("폴더 생성");
		} else {
			System.out.println("이미 존재하는 폴더");
		}
		
		
		// mkdirs()
		// 필요한 상위 폴더까지 모두 생성
		dir = new File("a/b/c");
		result = dir.mkdirs();
		if(result) {
			System.out.println("폴더 생성");
		} else {
			System.out.println("이미 존재하는 폴더");
		}
		
	}
}
