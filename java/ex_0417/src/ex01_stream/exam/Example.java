package ex01_stream.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 5, 7, 8, 10, 4, 1, 2, 6, 9, 1, 1, 1, 3, 3, 3);

		// 짝수만 골라 10을 더한 뒤 출력
		numbers.stream().filter(n -> n % 2 == 0).map(x -> x + 10).forEach(x -> System.out.print(x + " "));
		System.out.println();

		List<String> words = Arrays.asList("java", "spring", "react", "db", "server");
		// 문자열의 길이가 5이상인 문자열을 남긴 뒤
		// 대문자로 변환하여 출력
		words.stream().filter(x -> x.length() >= 5).map(String::toUpperCase).forEach(x -> System.out.print(x + " "));

		System.out.println();

		// 주문 금액이 50000원 이상인 주문의 개수를 구하시오.
		List<Integer> orders = Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
		orders.stream().filter(x -> x >= 5000).forEach(x -> System.out.print(x + " "));

		System.out.println();

		// 회원 나이 목록이 있을 때 아래를 각각 구하시오.
		List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);

		ages.stream().filter(x -> x >= 20 && x < 100).forEach(x -> System.out.print(x + " "));

		System.out.println();

		// 정수 리스트에서 짝수만 골라 제곱한 값들의 총합을 구하시오.
		numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers.stream().filter(x -> x % 2 == 0)
		.forEach(x -> System.out.print(x*x + " "));
		
		System.out.println();
		
		// 학생 점수 목록에서 80점 이상인 점수만 내림차순 정렬하여 새로운 리스트로 만드시오.
		List<Integer> scores = Arrays.asList(55, 90, 82, 67, 99, 80, 73);
		
		List<Integer> listScores = scores.stream().sorted((a,b) -> b-a)
				.filter(x -> x >= 80).collect(Collectors.toList());
		System.out.println(listScores);
		

	}
}
