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
	public BingoGame(Bingo bingo, Scanner sc) {
		this.bingo = new Bingo();
		this.sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                  
	}
	
	// start() 메서드를 작성하여 게임 전체 흐름을 구현
	// 게임 시작시 "빙고게임을 시작합니다" 라고 출력하기
	// 반복문을 사용하여 숫자를 계속 입력받을 수 있도록 한다
	public void start() {
		System.out.println("빙고게임을 시작합니다.");
		bingo.createBoard();
		
		// 1단계
		// 현재 빙고판을 출력한다
		bingo.printBoard();
		
		// 2단계
		// 사용자에게 숫자를 입력받는다
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		// 3단계 
		// 입력받은 숫자가 빙고판에 존재하면 체크처리
		boolean isTrue = bingo.markNumber(input);
		
		// 4단계
		// 숫자가 존재한다면 "X를 체크했습니다" 라고 출력하기
		if(isTrue) {
			System.out.println(input + "을(를) 체크했습니다.");
		}
		
		// 5단계
		// 숫자가 빙고판에 없으면 "빙고판에 없는 숫자입니다"
		if(!isTrue) {
			System.out.println("빙고판에 없는 숫자입니다.");
		}
	}
	
}
