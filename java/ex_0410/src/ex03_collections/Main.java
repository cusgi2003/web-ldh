package ex03_collections;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Bingo myBingo = new Bingo();
		Scanner myScanner = new Scanner(System.in);

		BingoGame bingo = new BingoGame();
		bingo.start();
	}
}
