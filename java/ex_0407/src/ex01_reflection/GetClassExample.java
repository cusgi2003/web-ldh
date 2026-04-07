package ex01_reflection;

public class GetClassExample {
	public static void main(String[] args) throws Exception{
		
		// Class 클래스
		// 클래스의 정보 자체를 담고 있는 클래스 
		
		// 방법 1
		// 클래스명.class : 클래스의 정보 가져오기
//		Class clazz = Car.class;
		
		// 방법 2
		// 경로를 찾아갔는데 클래스가 없을 수도 있기 때문에
		// ClassNotFoundException예외가 발생할 수 있는 코드가 된다
//		Class clazz = Class.forName("ex01_relection.Car");
		
		// 방법 3
		// 객체를 만들고 getClass() 메서드를 통해서 정보를 가져온다
		Car car = new Car();
		Class clazz = car.getClass();
		
		// getPackage() : 패키지 정보 읽기
		System.out.println("패키지 : " + clazz.getPackage().getName());
		// getSimpleName() : 패키지를 제외한 클래스 이름
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
		// getName() : 패키지를 포함한 전체 클래스명
		System.out.println("클래스 전체 이름 : " + clazz.getName());
	}
}
