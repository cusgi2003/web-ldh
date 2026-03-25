package ex03_break;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		// 1 ~ 45 사이의 난수 뽑기
		int rand = (int)(Math.random() * 45) + 1;
		Scanner sc = new Scanner(System.in);
//		
//		int answer;
//		
//		while(true) {
//			System.out.println("정답");
//			answer = sc.nextInt();
//			// 입력받은 answer와 난수가 일치하면
//			// 반복문을 빠져나가게 하기
//			if(answer == rand) {
//				break;
//			}
//		}
		
		// updown 게임을 for문ㅇ르 이용해서 만들기
		// 기회는 10번
		// 중간에 정바을 맞추면 종료하고 "정답입니다" 출력
		// 입력한 값이 정답보다 작으면 "up"
		// 크면 "down"
		// 10번만에 못맞추면 정답을 맞추지 못했습니다
		
		System.out.println("===================");
		System.out.println("updown 정답 : " + rand);
		
		
		int chance = 10;
		int count = 0;
		for(int i = 1; i<=10; i++) {
			
			System.out.print("숫자 맞추기 / 숫자 입력 : ");
			int chooise = sc.nextInt();
			count++;
			if(chooise > rand) {
				System.out.println("down");
			} else if(chooise < rand) {
				System.out.println("up");
			} else if(chooise == rand) {
				System.out.println("정답입니다");
				System.out.printf("%d번째 만에 맞추셨습니다\n", count);
				break;
			} else if(i == 10) {
				System.out.println("정답을 맞추지 못했습니다");
			}
		}
		
		System.out.println("===================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
