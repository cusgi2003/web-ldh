package ex02_charstream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		File f = new File("users.txt");
		
		while(true) {
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.print("아이디 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				
				User newUser = new User(id,password);
				FileOutputStream fos = new FileOutputStream(f);
				fos.write(newUser.toByteData());
				fos.close();
				
				System.out.println("회원가입 완료");
			} else if(choice == 2) {
				System.out.print("아이디 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				
				if(!f.exists()) {
					System.out.println("가입된 회원이 없습니다");
					continue;
				}
				
				// 파일 전체 읽기
				FileInputStream fis = new FileInputStream(f);
				byte[] buffer = new byte[(int) f.length()];
				fis.read(buffer);
				fis.close();
				
				String allUsersData = new String(buffer);
				String[] lines = allUsersData.split("\n");
			}
		}

	}
}
