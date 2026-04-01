package ex02_interface;

public class Main {
	public static void main(String[] args) {
		// 인터페이스도 하나의 타입이기 때문에 변수의 타입으로 사용할 수 있다
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		
		// rc 변수에 Audio객체로 교체할 수 있다
		rc = new Audio();
		rc.turnOn();
		
	}
}
