package ex01_list.arraylist.exam;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ArrayExam {
	public static void main(String[] args) {
		// Integer 타입의 리스트 객체 만들기
		List<Integer> list = new ArrayList<Integer>();
		
		// 리스트에 난수(1 ~30) 10개 넣기
		for(int i = 0; i < 10; i++) {
			if(list.size() < 10) {
				int num = (int)(Math.random()*45 +1);
				list.add(num);
			}
		}
		System.out.println(list);
		
		// 리스트에 담긴 데이터 중 홀수의 총합 구하기
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) %2 == 1) {
				sum += list.get(i);
			}
		}
		
		int total = 0;
		for(int i : list) {
			if(i % 2 == 1) {
				total += i;
			}
		}
		System.out.println("홀수의 합 : " + sum);
	}
}
