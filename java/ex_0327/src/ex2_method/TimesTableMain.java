package ex2_method;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		TimeTable timeTable = new TimeTable();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 단 : \n");
		int input = sc.nextInt();
		
		timeTable.showTable(input);
	}
}
