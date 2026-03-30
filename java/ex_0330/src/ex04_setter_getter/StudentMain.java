package ex04_setter_getter;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("홍길동");
		student.setAge(20);
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
	}
}
