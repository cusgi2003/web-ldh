package ex02_method;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		TimeTable timeTable = new TimeTable();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 단 : \n");
		int input = sc.nextInt();
		
		
		// return을 통해 반환값을 받는 경우, 연산결과를 변수에 대입한다
		// 반환값이 없는 경우 호출만 한다 
		
		timeTable.showTable(input);
	}
}
