package ex02_method;

import java.util.Scanner;

public class TimeTable {
	
	public void showTable(int input) {
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d \n", input, i, input * i);
		}
		
		System.out.println("=================");
	}
}
