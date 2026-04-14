package ex01_lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		CalculatorService cs = new CalculatorService();
		Calculator c = (a, b) -> a + b;

		cs.execute(c);
		cs.execute((a, b) -> a - b);

		// 람다식을 반환받아서 사용
		Calculator add = cs.getCalculator("add");
		Calculator sub = cs.getCalculator("sub");

		System.out.println(add.calc(2, 4));
		System.out.println(sub.calc(8, 6));

		String text = "This product is currently out of stock";

		TextService ts = new TextService();
		StringProcessor s1 = (upper) -> upper.toUpperCase();
		StringProcessor s2 = (upper) -> upper.replace("out of stock", "in stock");

		ts.processText(text, s1);
		ts.processText(text, s2);

		
		List<User> users = new  ArrayList<User>();
		users.add(new User("김철수", 25, "서울"));
		users.add(new User("이영희", 18, "인천"));
		users.add(new User("김민수", 30, "부산"));
		users.add(new User("박지은", 22, "서울"));
		
		UserService service = new UserService();
		System.out.println("성인 회원");
		
		service.filterUsers(users, service.getFilter("adult"));
		System.out.println("-----------");
		System.out.println("서울 거주 회원");
		service.filterUsers(users, service.getFilter("seoul"));
		System.out.println("-----------");
		System.out.println("김씨 회원");
		service.filterUsers(users, service.getFilter("kim"));
	}
}
