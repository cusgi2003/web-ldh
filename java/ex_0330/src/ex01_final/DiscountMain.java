package ex01_final;

import java.util.Scanner;

public class DiscountMain {
	public static void main(String[] args) {
		
		Discount discount = new Discount();
		
		System.out.print("입력할 금액 : ");
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		double resultDiscount = discount.discountRate(price);
		double resultCalculate = discount.calculatePrice(price);
		
		System.out.println("입력받은 금액의 할인률 : " + resultDiscount);
		System.out.println("최종 금액 : " + resultCalculate + "원");
	}
}
