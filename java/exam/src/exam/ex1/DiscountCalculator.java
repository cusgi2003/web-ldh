package exam.ex1;

public class DiscountCalculator {
	public static void main(String[] args) {
		int price = 10000;
		String grade = "VIP";
		int discountedPrice = 0;

		// [A] 아래에 설계서에 맞는 조건문을 작성하시오.

		if (grade.equals("VIP")) {
			discountedPrice = (int) (price * 0.8);
		}
		System.out.println("회원의 등급 : " + grade);
		System.out.println("최종 할인된 금액 : " + discountedPrice);

	}

}
