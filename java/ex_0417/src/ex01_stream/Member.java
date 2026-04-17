package ex01_stream;

public class Member {
	int id;
	String name;
	String status;
	
	public Member(int id, String name, String status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return String.format("Member{id = %d, name = %s, status = %s}", id, name, status);
	}
}
