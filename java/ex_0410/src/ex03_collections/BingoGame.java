package ex03_collections;

import java.util.Scanner;

// 빙고게임 프로세스
// 게임의 시작, 빙고 숫자 입력
public class BingoGame {
	// bingo 객체를 필드로 선언
	// 사용자에게 입력을 받기 위한 스캐너 객체를 필드로 선언
	private Bingo bingo;
	private Scanner sc;

	// 생성자에서 bingo 객체를 생성
	// 스캐너 객체도 생성하기
	public BingoGame() {
		this.bingo = new Bingo();
		this.sc = new Scanner(System.in);
	}

	// start() 메서드를 작성하여 게임 전체 흐름을 구현
	// 게임 시작시 "빙고게임을 시작합니다" 라고 출력하기
	// 반복문을 사용하여 숫자를 계속 입력받을 수 있도록 한다
	public void start() {
		System.out.println("빙고게임을 시작합니다.");
		bingo.createBoard();

		while (true) {
			// 1단계
			// 현재 빙고판을 출력한다
			System.out.println();
			bingo.printBoard();
			// 1-1단계
			// 현재 빙고 개수를 계산여 출력하기
			// 현재 빙고 개수 : X
			int countBingo = bingo.countBingo();
			System.out.println("현재 빙고 개수 : " + countBingo);
			
			
			// 1-2단계
			// 빙고 개수가 3개 이상이면 게임 종료
			// "3빙고 완성! 게임 종료"
			if(countBingo == 3) {
				System.out.println("3 빙고 완성! 게임 종료");
				break;
			}

			// 2단계
			// 사용자에게 숫자를 입력받는다
			System.out.println();
			System.out.print("숫자를 입력하세요 : ");
			int input = sc.nextInt();
			System.out.println();

			// 3단계
			// 입력받은 숫자가 빙고판에 존재하면 체크처리
			boolean isTrue = bingo.markNumber(input);

			// 4단계 & 5단계
			// 숫자가 존재한다면 "X를 체크했습니다" 라고 출력하기
			// 숫자가 빙고판에 없으면 "빙고판에 없는 숫자입니다"
			if (isTrue) {
				System.out.println(input + "을(를) 체크했습니다.");
			} else {
				System.out.println("빙고판에 없는 숫자입니다.");
			}

			bingo.printBoard();
		}
	}
}
