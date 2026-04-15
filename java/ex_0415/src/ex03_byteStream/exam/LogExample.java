package ex03_byteStream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LogExample {
	public static void main(String[] args) {
		// error.log파일을 읽어서 "ERROR"라는 단어가 몇번 등장하는 출력하세요

		try {
			FileInputStream fis = new FileInputStream("error.log");

			byte[] read = new byte[100];
			fis.read(read);

			String content = "";
			content = new String(read);

			int count = 0;
			int index = 0;

			while ((index = content.indexOf("ERROR", index)) != -1) {
				count++;
				index += "ERROR".length();
			}

			System.out.println("ERROR의 길이 : " + count);

			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
