package ex03_byteStream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		File f = new File("member.txt");
		byte[] read = new byte[(int) f.length()];

		try {
			FileInputStream fis = new FileInputStream("member.txt");

			fis.read(read);

			String info = new String(read);
			String[] member = info.trim().split("\n");
			System.out.println(Arrays.toString(member));

			Scanner sc = new Scanner(System.in);

			System.out.print("회원의 id 입력 : ");
			String id = sc.next();

			System.out.print("회원의 비밀번호 입력 : ");
			String pass = sc.next();

			if (id.equals(member[0]) && pass.equals(member[1])) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
