package ex02_charstream.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream("users.txt");
			
			System.out.print("아이디 입력 : ");
			String inputId = sc.nextLine();
			
			System.out.print("비밀번호 입력 : ");
			String inputPass = sc.nextLine();
			
			User u = new User(inputId, inputPass);
			byte[] res = u.toByteData();
			
			fos.write(res);
			fos.close();
			
			fis = new FileInputStream("users.txt");
			int code = 0;
			
			while((code = fis.read()) != -1) {
				if(fis.equals(res)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
