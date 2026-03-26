package ex03_class;

public class CarMain {
	public static void main(String[] args) {
		// Scanner는 자바에서 제공하는 클래스
		// Scanner 변수명 = new Scanner();
		Car c = new Car(); //자동차 1대 만듦
		
		// 객체를 통해 필드에 접근하는 방법
		// 변수명.필드명;
		// 필드에 들어있던 값을 수정할 수 있다.
		c.price = 1000000;
		c.color = "white";
		c.brand = "HYUNDAI";
		
		System.out.println("가격 : " + c.price);
		System.out.println("색상 : " + c.color);
		System.out.println("브랜드 : " + c.brand);
		
		// 두번째 자동차 객체 만들기
		Car c2 = new Car();
		c.price = 9000000;
		c.color = "black";
		c.brand = "KIA";
		
		System.out.println("가격 : " + c2.price);
		System.out.println("색상 : " + c2.color);
		System.out.println("브랜드 : " + c2.brand);
		
		}
}
