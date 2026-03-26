package ex01_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		char[] cards = {'1','L','O','2','V','3', 'E'};
		String ashki = "";
		// 배열애서 문자만 뽑아서 단어 만들기
		// 아스키 코드 활용 ( 대문자 영단어는 65 ~ 90, 소문자 영단어는 97 ~ 122)
		
		for(int i = 0; i < cards.length; i++) {
			if((cards[i] >= 65 && cards[i] <= 90)
					|| (cards[i] >=97 && cards[i] <= 122)) {
				ashki += cards[i];
			}
		}
		System.out.println("추출한 단어 : " + ashki);
		
		System.out.println("======================");
		// 변수 money에 10 ~ 5000원 사이의 난수를 발생시켜서 넣는다
		// 단, 1의 자리 숫자는 반드시0이 되도록 한다
		// 발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개 필요한지 작성하기
		// 가능한 적은 수의 동전을 사용하도록 한다
		
		int[] coin = {500, 100, 50, 10};
		int money = ((int)(Math.random()*500) + 1)*10;
		int coinSum = 0;
		System.out.println("난수의 값 : " + money + "원");
		
		for(int i = 0; i < coin.length; i++) {
			int count = money/coin[i];
			money %= coin[i];
			coinSum += count;
			System.out.println(coin[i] + "원 " + count + "개");
		}
		System.out.println("필요한 동전의 총합 : " + coinSum + "개");
		
		System.out.println("======================");
		// 키보드에서 배열의 길이 입력받기
		// 입력받은 배열의 길이만큼 알파벳을 요소로 넣는다
		// 배열의 모든 요소를 출력한다
		// 배열의 길이 : 5
		// ABCDE
		// 배열의 길이 : 10
		// ABCDEFGHIJ
		// ASHKI -> 65 ~ 90
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 배열의 길이 : ");
		int input = sc.nextInt();
		
		char[] charArray = new char[input];
		
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] += 65 + i;
		}
		System.out.println(charArray);
		
		// 로또번호 구하기
		// 1 ~ 45 사이의 난수를 발생시켜 로또번호 6자리를 만드는 코드 작성하기
		
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			System.out.println(Arrays.toString(lotto));
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}	
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
