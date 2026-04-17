package exam2;

public class Member {
	private String id;
	private String name;
	private int age;

	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void printInfo() {
		System.out.println("아이디 : " + this.id + ", 이름 : " + this.name + ", 나이 : " + this.age);
	}
}
