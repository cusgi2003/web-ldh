package ex01_exception.service;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Convertor2 convertor = new Convertor2();
		OrderService os = new OrderService();
		
		try {
			System.out.println("상품 가격 입력 :");
			String priceStr = sc.next();
			
			System.out.println("상품 수량 : ");
			String quantityStr = sc.next();
			
			int price = convertor.toInt(priceStr);
			int quantity = convertor.toInt(quantityStr);
			
			int total = os.calculator(price, quantity);
			System.out.println("총 금액 : " + total);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
