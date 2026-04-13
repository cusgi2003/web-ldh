package ex01_map.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		// id와 password 저장
		// 둘 다 String
		HashMap<String, String> users = new  HashMap<String, String>();
		
		users.put("admin", "1234");
        users.put("user1", "abcd");
        users.put("guest", "1111");
		
		// 아이디, 비밀번호를 입력해서 로그인을 시도할 때
		// 1. 아이디가 존재하지 않는다
		// 2. 비밀번호 오류다
		// 3. 로그인 성공
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("id 입력 : ");
        String id =  sc.next();
        System.out.print("비밀번호 입력 : ");
        String pass = sc.next();
        
        if(!users.containsKey(id)) {
        	System.out.println("아이디가 존재하지 않는다");
        } else {
        	if(!users.get(id).equals(pass)) {
            	System.out.println("비밀번호 오류디");
            } else {
            	System.out.println("로그인 성공");
            }
        }

	}
}
