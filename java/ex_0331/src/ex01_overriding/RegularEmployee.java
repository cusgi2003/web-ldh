package ex01_overriding;

public class RegularEmployee extends Employee{
	private int salary;
	
	public RegularEmployee(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	@Override
	public int getPay() {
		System.out.println("정규직 " + name + "의 급여 : " + salary);
		return salary;
	}
	
}
