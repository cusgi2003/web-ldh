package ex05_polymorphism.exam01;

class CardPayment extends Payment{
	@Override
	public int pay(int amount) {
		System.out.println("카드로 " + amount + "원을 결제합니다");
		return amount;
	}
}

class KakaoPayment extends Payment{
	@Override
	public int pay(int amount) {
		System.out.println("카카오페이로 " + amount + "원을 결제합니다");
		return amount;
	}
}

class Order {
	public Payment payment;
	
	public void processPayment(int amount) {
		payment.pay(amount);
	}
}


public class Payment {
	int amount;
	
	public int pay(int amount) {
		System.out.println(amount + "원을 결제합니다");
		return amount;
	}
}
