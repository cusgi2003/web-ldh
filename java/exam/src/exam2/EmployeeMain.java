package exam2;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("김철수", 3500));
		employees.add(new Employee("이영희", 2500));
		employees.add(new Employee("박길동", 5000));
		employees.add(new Employee("이길동", 2000));
		
		Collections.sort(employees, (e1, e2) -> e2.salary - e1.salary);
		
		for(Employee e : employees) {
			e.printInfo();
		}
		
		System.out.println("----------------------------");
		
		Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
		
		for(Employee e : employees) {
			e.printInfo();
		}
	}
}
