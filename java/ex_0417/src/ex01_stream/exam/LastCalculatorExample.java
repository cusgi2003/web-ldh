package ex01_stream.exam;

import java.util.Arrays;
import java.util.List;

public class LastCalculatorExample {
	public static void main(String[] args) {
		// 최종연산
		// 스트림처리의 마지막 단계
		// 이 단계가 와야 스트림이 실제로 동작

		// 스트림 파이프라인의 마지막에서 실행되는 연산

		// 특징
		// 1. 스트림을 끝낸다
		// ㄴ 한 번 사용이 끝난 스트림은 다시 사용할 수 없다
		// 2. 실제 실행을 일으킨다
		// ㄴ 중간 연산은 준비만 해두지만, 최초 연산은 실제 작업을 시작한다
		// 3. 결과를 만들거나 소비한다
		// ㄴ 최종 연산은 값을 반환하거나, 데이터를 출력하거나 저장하면서 끝난다

		// count()
		// 조건에 맞는 요소 개수를 센다
		List<String> words = Arrays.asList("java", "sptring", "'db", "react");

		long count = words.stream().filter(s -> s.length() >= 5).count();
		System.out.println("길이가 5 이상인 요소의 개수 : " + count);

		// anyMatch()
		// 하나라도 조건에 맞는 요소가 있으면 true

		List<Integer> numbers = Arrays.asList(1, 3, 5, 8);

		boolean result = numbers.stream().anyMatch(x -> x % 2 == 0);

		System.out.println("결과 : " + result);

		// allMatch()
		// 모든 조건이 맞아야 true
		result = numbers.stream().allMatch(x -> x % 2 == 0);

		System.out.println("결과 : " + result);
		
		// noneMatch()
		// 모든 요소가 조건에 하나도 맞지 않아야 함
		
		result = numbers.stream().noneMatch(x -> x % 2 == 0);

		System.out.println("결과 : " + result);
		
	}
}
