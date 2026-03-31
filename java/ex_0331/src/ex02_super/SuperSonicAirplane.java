package ex02_super;

public class SuperSonicAirplane extends AirPlane{
	// 상수 선언
	// NORMAL = 1;
	// SUPERSONIC = 2;
	
	static final int NORMAR = 1;
	static final int SUPERSONIC = 2;
	
	//NORMAL 상수로 초기화된 flyMode 필드 선언
	int flyMode = NORMAR;
	
	// fly() 메서드를 오버라이딩 한다
	// flyMode가 SUPERSONIC이라면 "초음속 비행을 합니다"
	// 그게 아니면 부모의 fly()메서드 호출하기 
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다");
		} else {
			super.fly();
		}
	}
}
