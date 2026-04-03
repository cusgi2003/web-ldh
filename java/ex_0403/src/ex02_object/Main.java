package ex02_object;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("키보드", 5000, 10);
		Product p2 = new Product("마우스", 15000, 20);
		Product p3 = new Product("모니터", 105000, 100);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Object[] arr = {"java", 100, 3.14, new Employee("홍길동", "개발팀")};
		
		// 반복문으로 배열을 순회하면서
		// 문자열이면 "문자열데이터 : xx"
		// 정수면 "정수형 데이터 : xx"
		// 실수면 "실수형 데이터 : xx"
		// Employee 객체면 이름과 부서를 출력
		
		for(Object obj : arr) {
			if(obj instanceof String) {
				System.out.println("문자열 데이터 : " + obj);
			} else if(obj instanceof Integer) {
				System.out.println("정수형 데이터 : " + obj);
			} else if(obj instanceof Double) {
				System.out.println("실수형 데이터 : " + obj);
			} else if(obj instanceof Employee emp) {
				System.out.println("이름 : " + emp.name + ", 부서 : " + emp.dept);
			}	
		}
		
	}
}
