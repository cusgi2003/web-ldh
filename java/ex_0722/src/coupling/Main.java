package coupling;

import coupling.CommonCoplingExample.ModuleA;
import coupling.CommonCoplingExample.ModuleB;
import coupling.ContentCouplingExample.BankAccount;
import coupling.ContentCouplingExample.HackerModule;
import coupling.ControlCouplingExample.OrderService;
import coupling.ExternalCouplingExample.NetWorkClient;

public class Main {
	public static void main(String[] args) {
		SquareCalculator calc = new SquareCalculator();
		int result = calc.calculateSquare(5);
		System.out.println(result);
		
		OrderService service = new OrderService();
		double finalPrice = service.calculatePrice(10000, true);
		System.out.println("최종 결제 금액 : " + finalPrice);
		
		NetWorkClient client = new NetWorkClient();
		client.connect();
		
		ModuleA moduleA = new ModuleA(); // 전역변수의 값을 바꿈
		ModuleB moduleB = new ModuleB(); // 바뀐 전역변수의 영향을 그대로 받는다.
		
		moduleA.updateDiscount();
		moduleB.printPrice(100);
		
		BankAccount account = new BankAccount();
		HackerModule hacker = new HackerModule();
		
		hacker.stealMoney(account); // 상대 겍체 내부 잔액을 강제로 조작
		
	}
}
