package ex01_overriding;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee("홍길동");
		RegularEmployee regular = new RegularEmployee("김철수", 3000000);
		PartTimeEmployee partTime = new PartTimeEmployee("이영희", 500000, 10);
		
		regular.getPay();
		partTime.getPay();
		
	}
}
