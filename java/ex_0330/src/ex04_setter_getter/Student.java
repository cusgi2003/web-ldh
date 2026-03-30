package ex04_setter_getter;

public class Student {
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		} else {
			System.out.println("잘못된 나이입니다");
		}
	}
		
	public int getAge() {
		return this.age;
	}
}
