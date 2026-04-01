package ex03_interface;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		c.tire1 = new Hankook();
		c.tire2 = new Hankook();
		
		c.run();
		
		// 타이어를 금호타이어로 교체하고 메서드를 실행해보기
		
		c.tire1 = new Kumho();
		c.tire2 = new Kumho();
		
		c.run();
	}
}
