package ex05_Math;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import lombok.ToString;

public class RandomExample {
	public static void main(String[] args) {
		// 로또번호(1 ~ 45)를 뽑아서 배열에 넣기
		
		int lotto[] = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int input[] = new int[6];
		for(int i = 0; i< input.length; i++) {
			System.out.print((i+1) + "번째 선택번호 : ");
			input[i] = sc.nextInt();
		}
		
		Arrays.sort(lotto);
		Arrays.sort(input);
		System.out.println("로또 번호 : " + Arrays.toString(lotto));
		System.out.println("내 번호 : " + Arrays.toString(input));
		if(Arrays.equals(lotto, input)) {
			System.out.println("1등 당첨");
		} else {
			System.out.println("꽝");
		}
	}
}
