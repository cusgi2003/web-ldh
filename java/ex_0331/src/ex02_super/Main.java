package ex02_super;

public class Main {
	public static void main(String[] args) {
		// 초음속 비행기 객체 생성하기
		SuperSonicAirplane sa = new SuperSonicAirplane();
		// takeOff() 메서드 호출하기
		sa.takeOff();
		// fly() 메서드 호출하기
		sa.fly();
		// 비행모드를 초음속으로 바꾸기sa.flyMode = SuperSonicAirplane.SUPERSONICl
		// fly()메서드 호출해서 확인하기
		 sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		// 비행모드를 노말로 바꾸기
		// fly() 메서드 호출해서 확인하기
		sa.flyMode = SuperSonicAirplane.NORMAR;
		// 착륙하기
		
		sa.fly();
		sa.land();
	}
}
