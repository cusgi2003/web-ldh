package ex01_stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// 스트림을 사용하기 위해서는 스트림 객체를 생성해야 한다

		// 컬렉션에서 생성하는 방법
		List<String> list = Arrays.asList("A", "B", "C");
		Stream<String> stream = list.stream();

		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4));
		Stream<Integer> setSteram = set.stream();

		// Map은 Collection 인터페이스가 아니다
		// 그렇기 때문에 stream() 메서드가 존재하지는 않는다

		// keySet()
		// key만 스트림으로 만들고 싶을 때 사용
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1000);
		map.put("바나나", 2000);

		map.keySet().stream();

		// values()
		// 값만 스트림으로 만들고 싶을 때 사용한다.
		map.values().stream();

		// entrySet()
		// 키와 값을 둘 다 써야될 때 사용한다
		map.entrySet().stream();

		// 배열에서 생성하는 방법
		String[] fruits = { "사과", "바나나", "포도" };
//		String[] fruits = new String[3];
//		fruits[0] = "사과";

		// Arryays.stream(배열)을 통한 스트림 생성
		Arrays.stream(fruits);

		// Stream.of()을 통한 스트림 생성
		Stream.of(fruits);

		// 기본타입(int,long,double등)은 일반 Stream이 아니라 전용 스트림을 사용한다
		// 일반 스트림을 쓰게 되면 int -> Integer 처럼 변환되는 작업을 거쳐야 하기 때문에
		// 성능 저하가 발생할 수 있다.

		// int -> IntStream
		// long -> logStream
		// double DoubleStream

		int[] iArr = { 1, 2, 3 };
		IntStream iStream = Arrays.stream(iArr);

		// IntStream.of()를 사용해서 직접 생성하기
		IntStream iStream2 = IntStream.of(1, 2, 3, 4);

		// 범위 기반 생성
		// range(시작값, 끝값)
		IntStream.range(1, 5);

		// rangeClosed(시작값, 끝값)
		IntStream.rangeClosed(1, 5);

		// iterate()
		IntStream.iterate(0, n -> n + 1);

	}

}
