package ex05_polymorphism.exam01;

public class PayMain {
	public static void main(String[] args) {
		Order myOrder = new Order();
		myOrder.payment = new Payment();
	
		myOrder.processPayment(1000);
		
		myOrder.payment = new CardPayment();
		myOrder.processPayment(2000);
		
		myOrder.payment = new KakaoPayment();
		myOrder.processPayment(3000);
	}
}
