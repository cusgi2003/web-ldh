package ex01_abstact;

import java.util.Iterator;

abstract class Delivery {
	public void printInvoice() {
		System.out.println("송장을 출력합니다");
	}
	
	public abstract void ship();
	
	public void complete() {
		System.out.println("배송처리가 완료되었습니다");
	}
}

class RocketDelivery extends Delivery{

	@Override
	public void ship() {
		System.out.println("로켓배송을 시작합니다");
	}
	
}

class StorePickup extends Delivery{

	@Override
	public void ship() {
		System.out.println("매장에서 직접 수령합니다");
	}
	
}


public class DeliveryMain {
	public static void main(String[] args) {
//		Delivery[] delivery = new Delivery[2];
		
//		delivery[0] = new RocketDelivery();
//		delivery[1] = new StorePickup();
		
		Delivery[] delivery = {new RocketDelivery(), new StorePickup()};
		
		for(Delivery delive : delivery) {
			delive.printInvoice();
			delive.ship();
			delive.complete();
			
			System.out.println("================");
		}
	}
		
	
}
