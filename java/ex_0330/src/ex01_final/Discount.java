package ex01_final;

public class Discount {
	
	// 할인률 
	static double RATE_HIGHT = 0.2;
	static double RATE_MID = 0.1;
	static double RATE_LOW = 0.05;
	
	// 금액별 할인률 결정하는 메서드
	public double discountRate(int price) {
		if(price >= 10000) {
			return RATE_HIGHT;
		} else if(price >= 50000) {
			return RATE_MID;
		} else {
			return RATE_LOW;
		}
	}
	
	// 금액별 할인률이 적용된 금액을 반환하는 메서드
	public double calculatePrice(int price) {
		return (price * (1 - discountRate(price)) );
	}
	
}
