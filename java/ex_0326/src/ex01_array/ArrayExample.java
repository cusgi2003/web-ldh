package ex01_array;

public class ArrayExample {
	public static void main(String[] args) {
		char[] cards = {'1','L','O','2','V','3', 'E'};
		String ashki = "";
		// 배열애서 문자만 뽑아서 단어 만들기
		// 아스키 코드 활용
		
		for(int i = 0; i < cards.length; i++) {
			if(cards[i] >= 65 && cards[i] <= 90) {
				ashki += cards[i];
			}
		}
		System.out.println(ashki);
	}
}
