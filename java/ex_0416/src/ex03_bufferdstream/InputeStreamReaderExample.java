package ex03_bufferdstream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputeStreamReaderExample {
	public static void main(String[] args) {
		// inputStreamReader
		// Java 입출력에서 바이트 스트림을 문자 스트림으로 변환해주는 다리 역할

		try (FileInputStream in = new FileInputStream("test.txt");
			// InputStreamReader(기반, 인코딩 타입)
			InputStreamReader is = new InputStreamReader(in, "UTF-8");){
			
			int read = 0;
			
			while((read = is.read()) != -1) {
				System.out.println((char)read);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
