package ex01_for;

public class MultiForExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		// 두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는 모든 경우의 수를 출력하기
		// 1 5
		// 2 4
		// 3 3
		// 4 2
		// 5 1
		
		int count = 0;
		
		for(int first_dice = 1; first_dice <= 6; first_dice++) {
			for(int second_dice = 1; second_dice <= 6; second_dice++) {
				if(first_dice + second_dice == 6) {
					System.out.println("첫 번째 주사위 : " + first_dice
							+ ", 두 번째 주사위 : " + second_dice);
					count++;
				}
			}
		}
		System.out.println("경우의 수 : " + count + "개");
		
		// print()
		// println()
		
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(1 + j+ " ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		
		count = 1;
		
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(count++ + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		// A B C D
		// E F G H
		// I J K L;
		
		char ch = 'A';
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <=4; j++) {
				System.out.printf("%c ",ch++);
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		
		
		
		
		
		
		
		
		
	}
}
