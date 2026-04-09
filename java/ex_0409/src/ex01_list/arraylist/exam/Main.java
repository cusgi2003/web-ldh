package ex01_list.arraylist.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex01_list.arraylist.Member;

public class Main {
	public static void main(String[] args) {
		List<UserInfo> userlist = new ArrayList<UserInfo>();
		UserInfo user = new UserInfo();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("아이디 : ");
			user.setUserId(sc.next());
			
			for(int j = 0; j < i; j++) {
				if(user.getUserId().equals(userlist.get(i).getUserId())) {
					System.out.println("아이디 중첩");
					i--;
				}
			}
			
			
			System.out.print("비밀번호 : ");
			user.setPassword(sc.nextInt());	
			userlist.add(user);

			for(UserInfo u : userlist) {
				System.out.println(u.getUserId());
				System.out.println(u.getPassword());
				System.out.println("------------");
			}
		}
		
	}
}
