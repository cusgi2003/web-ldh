package ex91_generic.exam2;

public class Main {
	public static void main(String[] args) {
		PaymentProcessor<CardPayment> card = 
				new PaymentProcessor<CardPayment>(new CardPayment());
		PaymentProcessor<KakaoPay> kakao = 
				new PaymentProcessor<KakaoPay>(new KakaoPay());
		
		card.process();
		kakao.process();
		
	}
}
