package ex03_byteStream.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
	public static void main(String[] args) {
		// file.txt를 만들고, 아무 내용이나 입력
		// fis를 이용해 내용을 읽어온 뒤,
		// 뒤집어도 같은 내용인지 아닌지를 판별

		try {
			FileInputStream fis = new FileInputStream("file.txt");

			byte[] read = new byte[100];

			fis.read(read);

			String result = new String(read).trim();
			String changeR = new StringBuffer(result).reverse().toString();
			
			StringBuilder rev = new StringBuilder(result);
			
			if(result.equals(changeR)) {
				System.out.println("값이 일치합니다");
			} else {
				System.out.println("값이 다릅니다");
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
