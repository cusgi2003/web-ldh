package ex01_exception.service;

public class OrderService {
	public int calculator(int price, int quantity) throws IllegalArgumentException{
		if(price <= 0) {
			throw new IllegalArgumentException("가격은 1 이상이어야 합니다.");
		} else if(quantity <= 0) {
			throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
		}
		
		return price * quantity;
	}
}
