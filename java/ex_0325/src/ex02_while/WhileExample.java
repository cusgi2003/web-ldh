package ex02_while;

import java.util.Random;
import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		int x = 1;
		
		// x의 값이 변하지 않으면 조건이 거짓이 될 수 없기 때문에
		// 무한으로 돌게 된다.
		while(x < 4) {
			System.out.println(x);
			x++;	// 초기식의 값을 변화시켜줄 수 있는 증감식을 따로 작성을 해줘야 한다.
		}
		
		// 1 ~ 6 사이 난수를 뽑아 변수에 저장하기
		int rand = (int)(Math.random()*6) + 1;
		
		// 정답을 키보드에서 입력받기
		// 정답을 맞출때 까지 반복
		
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		// 몇번만에 맞출 수 있을지 모름
//		while(answer != rand) {
//			System.out.print("정답 : ");
//			answer = sc.nextInt();
//			
//			if(answer == rand) {
//				System.out.println("정답을 맞췄습니다");
//			}
//			
//		}
		
		// 1 ~ 100까지의 총합 구하기 (while)
		
		int i = 1;
		int start = 0;
		while(i <= 100) {
			start += i;
			i++;
		}
		System.out.println("1 ~ 100까지의 총합 : " + start);
		
		// 정수 하나를 입력받아서, 각 자리의 합을 더한 결과를 출력하기
		// Ex) 12345 -> 1 + 2 + 3+ 4 + 5 => 15를 출력
	
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num > 0) {
			sum += num %10;
			num = num/10;
		}
		
		System.out.println("각 자리의 총합 : " + sum);
		
		
		
		
	}
}
