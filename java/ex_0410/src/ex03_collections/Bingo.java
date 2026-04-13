package ex03_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bingo {
	private int[][] board = new int[5][5];

	public void createBoard() {
		// 1 ~ 50사이의 난수가 있다
		// 5 x 5 의 빙고판에 25개의 숫자를 채운다
		// 겹치면 안됨

		// 만약 숫자가 오름차순으로 들어간다면 섞어주기

		// ex)

		// 5 7 23 9 13
		// 41 38 17 10 3
		// 26 ...

		Set<Integer> bingo = new HashSet<Integer>();
		while (bingo.size() != 25) {
			bingo.add((int) ((Math.random() * 50) + 1));
		}
		List<Integer> list = new ArrayList<>(bingo);
		Collections.shuffle(list);

		int index = 0; // 리스트의 인덱스를 추적

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = list.get(index++);
			}
		}
	}

	// 숫자르 체크하는 메서드
	// 매개변수 : int number; ㅡ
	// 메서드명 : markNumber'
	// 숫자를 넘겨받으면 해당 빙고칸의 숫자를 0으로 반바꾸고 true를 반환
	// 아니면 false를 반환
	public boolean markNumber(int number) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == number) {
					board[i][j] = 0;
					return true;
				}
			}
		}
		return false;
	}

	// 현재 빙고판의 상태를 출력하는 printBoard() 메서드 만들기
	// 체크된 카드의 숫자는 X로 출력

	// 08 14 25 37 42
	// 11 03 50 29 16
	// x 22 18 09 31
	// 44 10 27 35 01
	// 13 06 40 19 47

	public void printBoard() {
		System.out.println("===> 현재 빙고판 <===");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					System.out.printf("%3s", "X");
				} else {
					System.out.printf("%3d", board[i][j]);
				}
			}
			System.out.println();
		}
	}

	// 빙고 개수 계산 기능
	// 현재 빙고판에서 완성된 빙고 줄 수를 계산하는 countBingo()메서드 작성하기
	// 빙고는 다음 기준으로 판단하기
	// 가로 5줄, 세로 5줄, 대각선 2줄
	// 총 빙고 개수를 int로 반환
	public int countBingo() {
		int isBingo = 0;

		for (int i = 0; i < board.length; i++) {
			boolean bingo = true;
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != 0) {
					bingo = false;
					break;
				}
			}
			if (bingo) {
				isBingo++;
			}
		}

		for (int j = 0; j < board.length; j++) {
			boolean bingo = true;
			for (int i = 0; i < board[j].length; i++) {
				if (board[j][i] != 0) {
					bingo = false;
					break;
				}
			}
			if (bingo) {
				isBingo++;
			}
		}
		
		boolean edge1 = true;
		boolean edge2 = true;
		// 오른쪽아래 -> 왼쪽 위
		for(int i = 0; i< board.length; i++) {
			if(board[i][i] != 0) {
				edge1 = false;
				break;
			}
		}
		if(edge1) {
			isBingo++;
		}

		// 오른쪽 위 -> 왼쪽 아래
		for(int i = 0; i < board.length; i++) {
			if(board[i][4-1] != 0) {
				edge2 = false;
				break;
			}
		}
		if(edge2) {
			isBingo++;
		}
		
		return isBingo;
	}

}
