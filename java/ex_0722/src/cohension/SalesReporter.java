package cohension;

// 통신적 응집도
// 동일한 입력과 출력을 사용하여 다른 기능을 수행하는 활동등이 모여 있는 경우
public class SalesReporter {

	public void generateReport(double[] salesData) {

		// 똑같은 매출 데이터를 두 개의 작업에 전달한다.

		// 동일한 salesData를 사용해 총 매출액 계산
		double totalRevenue = calculrateTotalRevenue(salesData);

		// 동일한 salesData를 사용해 세금을 계산
		double taxAmount = calculrateTax(salesData);
	}

	// 배열의 총 합을 계산하여 반환
	public double calculrateTotalRevenue(double[] salesData) {
		double sum = 0;

		for (double price : salesData) {
			sum += price;
		}

		return sum;
	}

	// 매출별 10%식 땐 금액이 얼만지
	public double calculrateTax(double[] salesData) {
		double totalTax = 0;

		for (double price : salesData) {
			totalTax += price * 0.1;
		}
		return totalTax;
	}

}
