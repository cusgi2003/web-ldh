package ex01_overriding;

public class PartTimeEmployee extends Employee{
	private int perRate;
	private int salaryHours;
	
	public PartTimeEmployee(String name, int perRate, int salaryHours) {
		super(name);
		this.perRate = perRate;
		this.salaryHours = salaryHours;
	}
	
	@Override
	public int getPay() {
		System.out.println("아르바이트 " + name + "의 급여 : " + perRate * salaryHours);
		return perRate * salaryHours;
	}
}
