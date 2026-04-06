package ex01_lombok;


public class Member {

	private String id;
	private String name;
	private int age;
	
	// 1. 생성자를 이용하여 초기화하기
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
