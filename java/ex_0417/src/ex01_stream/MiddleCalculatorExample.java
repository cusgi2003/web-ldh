package ex01_stream;

import java.util.Arrays;
import java.util.List;

public class MiddleCalculatorExample {
	public static void main(String[] args) {
		// 스트림의 연산
		// 중간연산

		// 특징
		// 1. 메서드의 연산 결과로 다른 Stream 객체를 반환한다
		// 2. 혼자서는 최종결과를 낼 수 없다
		// 3. 최종 연산이 와야 중간연산들이 실제로 동작한다
		// 4. 중간연산은 메서드 체이닝을 통해 연결할 수 있다

		// fillter(조건)
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.stream().filter(t -> t % 2 == 0).forEach(System.out::print);
		
		System.out.println("\n-------------------");
		// 요소의 변환
		// map(Function<T,R>)
		List<String> sList = List.of("java", "spring", "react");
		
		sList.stream().map(String::toUpperCase).forEach(System.out::println);
		
		// mapToInt()
		// 객체 스트림을 IntStream으로 변환한다
		List<String> list2 = List.of("a", "bb", "ccc");
		
		list2.stream().mapToInt(String::length)
		.forEach(System.out::println);
		
		// 정렬계열
		// sorted()
		int[] arr =  {5,2,9,1,7};
		
		// 오름차순 정렬
		Arrays.stream(arr).sorted().forEach(System.out::println);
		
		// 내림차순
		Arrays.stream(arr)
		.boxed()	// 기본형 객체 스트림으로 변경 IntStream -> Stream<Integer>
		.sorted((a,b) -> b-a)
		.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		
		// sorted(Comparator<? super T>)
		// 사용자 정의 기준으로 정렬한다
		
		// 글자수 순으로 오름차순
		sList.stream()
		.sorted((a,b) -> a.length() - b.length())
		.forEach(x -> System.out.print(x + " "));
		
		// 중복제거
		// distinct()
		
		int[] iArr = {1,1,2,3,3,3,3,3,4,4,4,4,4,5,5,6};
	}
}
