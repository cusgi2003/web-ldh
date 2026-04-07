package ex03_generic.exam;

public class StudentPrinter{
	
	public <T, U> void printStudent(T name, U age) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public static void main(String[] args) {
		StudentPrinter sp = new StudentPrinter();
		sp.printStudent("김철수", 20);
	}
}
