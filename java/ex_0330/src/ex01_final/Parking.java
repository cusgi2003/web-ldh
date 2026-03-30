package ex01_final;

public class Parking {
	
	// 기본요금 : 10000원(상수)
	// 추가 요금 : 시간당 2000원(상수)
	
	static int primary_charge = 10000;
	static int plus_charge = 2000;
	
	// 요금 계산 메서드
	public int resultCharge(int hour) {
		return primary_charge + (plus_charge * hour);
	}
}
