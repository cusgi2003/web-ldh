package ex06_date;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		
		// Java 8 이후에 등장한 현대적인 날짜 API
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 원하는 날짜와 시간을 직접 만들기
		LocalDateTime dateTime = LocalDateTime.of(2026, 4,6,10,30);
		System.out.println(dateTime);
		
		
		// 날짜/시간 전체를 알고 있기 때문에
		// 연도, 월, 일, 시 , 분 등을 꺼낼 수 있다
		
		System.out.println("연도 : " + now.getYear());
		System.out.println("월 : " + now.getMonthValue());
		System.out.println("일 : " + now.getDayOfMonth());
		System.out.println("시 : " + now.getHour());
		System.out.println("분 : " + now.getMinute());
		System.out.println("초 : " + now.getSecond());
		
		
		// 날짜와 시간 더하기 빼기
		
		// 일 더하기
		System.out.println("10일 뒤 : " + now.plusDays(10));
		// 월 더하기
		System.out.println("2달 뒤 : " + now.plusMonths(2));
		// 년 더하기 : plusYears(숫자)
		// 빼기 : minusDay(), minusMonths(), minusYears() 
		
	}
}
