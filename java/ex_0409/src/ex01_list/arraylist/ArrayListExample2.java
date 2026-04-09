package ex01_list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer> ages = new ArrayList<Integer>();
		
		names.add("홍길동");
		ages.add(30);
		
		List<Member> members = new ArrayList<Member>();
		Member m1 = new Member();
		m1.setName("홍길동");
		m1.setAge(30);
		
		members.add(m1);
		members.add(new Member());
		
		System.out.println(members.get(0).getName());
		System.out.println(members.get(0).getAge());
		
		
		members.get(1).setName("박민수");
		members.get(1).setAge(40);
		
		System.out.println(members.get(1).getName());
		System.out.println(members.get(1).getAge());
		
		
		// 김철수 , 25
		members.add(new Member());
		members.get(2).setName("김철수");
		members.get(2).setAge(25);
		
		System.out.println("---------------");
		System.out.println(members.get(2).getName());
		System.out.println(members.get(2).getAge());
		
	}
}
