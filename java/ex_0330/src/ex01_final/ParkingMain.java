package ex01_final;

import java.util.Scanner;

public class ParkingMain {
	public static void main(String[] args) {
		// 사용시간을 키보드에서 입력받아 총 금액이 얼마인지 구하기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주차 시간을 입력 : ");
		int hour = sc.nextInt();
		
		Parking parking = new Parking();
		int result = parking.resultCharge(hour);
		
		System.out.println("최종 요금 : " + result);
	}
}
