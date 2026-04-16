package ex01_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {
	public static void main(String[] args) {
		// 상대경로에 있는 이미지 파일을 바이트 기반 스트림으로 읽어서
		// 복사본 만들기 복사본 이름 -> wall_copy.jpg
		// 복사하면서 걸리는 시간을 currentTimeMillis()로 측정하기
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("wall.jpg");
			fos = new FileOutputStream("wall_copy.jpg");

			byte[] buffer = new byte[512];
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기");

			int data = 0;
			// 1바이트씩 읽어서
			
			while ((data = fis.read(buffer)) != -1) {
				// 바로 작성하기
				// buffer는 0부터 data개 만큼 출력파일에 기록
				fos.write(buffer, 0, data);
			}
			// 파일은 4mb
			// 우리가 전달한 배열은 512byte
			// 우리가 전달한 파일을 512바이트씩 잘라서 여러번 읽고 쓰는 방식
			
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();

			long times = (end - start) / 1000;
			System.out.println("걸린 시간 : " + times);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// 닫을 때는 역순으로 닫는다
			try {
				if (fos != null) {
					fos.close();
				}

				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
