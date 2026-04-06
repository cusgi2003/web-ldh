package ex02_system;

public class TimeExample {
	public static void main(String[] args) {
		// currentTimeMillis()
		// 로그 시간계산이나 날짜 계산에 사용
		// 1970년 1월 1시 0분 0초부터 현재까지 흐른 시간을 밀리초 단위로 반환한단
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		long start = System.currentTimeMillis();
		
		start = System.nanoTime();
		// nanoTime()
		// 성능 테스트
		// 알고리즘 비교
		
		// 작업
		
		for(int i = 0; i < 100000; i++) {};
		
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간(ms) : " + (end - start));
		
		// nanoTime()
		// 정확한 시간을 측정하기 위한 메서드
		// 나노초 ( 1초 = 10억 ns )
		
	}
}
