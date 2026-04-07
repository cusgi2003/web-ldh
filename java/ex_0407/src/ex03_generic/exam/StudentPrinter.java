package ex03_generic.exam;

public class StudentPrinter<T,U> {
	private T name;
	private U age;
	
	public void set(T name, U age) {
		this.name = name;
		this.age = age;
	}
}
