package ex02_object;

public class hashcodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(2, "홍길동");
		
		System.out.println(s1.hashCode() == s2.hashCode());
		
		
	}
}
