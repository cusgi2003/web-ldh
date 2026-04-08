package ex91_generic.exam2;

public class CardPayment implements Payment{
	@Override
	public void pay() {
		System.out.println("CardPayment 진행 중");
	}

}
