package ex01_set.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Set 인터페이스가 제공하는 메서드
// void add(E e) : 데이터를 삽입
// void remove(Object o) : 선택된 데이터를 삭제
// void clear() : 모든 데이터를 삭제
// int size() : 저장된 데이터의 개수를 반환
// contains(E e) : 셋에 해당 데이터가 저장되어있는지 확인

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet클래스는 Set인터페이스에서 가장 많이 사용되는 구현클래스이다
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Spring");
		set.add("React");
		set.add("Java");	// 에러는 안남
		
		System.out.println(set);
		System.out.println("개수 : " + set.size());
		
		// Collection<? extends E> c)
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1,2,3,4,1,2,3,1,2,3,1,2,3));
		System.out.println(set2);
		System.out.println("개수 : " + set2.size());
		
		
		// HashSet에 1 ~ 45 사이의 난수 6개 넣기
		
		Set<Integer> lotto = new HashSet<Integer>();
		while(lotto.size() != 6) {
			lotto.add((int) (Math.random()*45 +1));
		}
		System.out.println(lotto);
		
		// set을  배열로 만들기
		// new Integer[0] -> 배열의방 개수를  0으로 하면 set이 add 해둔 개수만큼
		// 자동으로 배열의 index가 만들어진다
		// toArray()
		Integer[] arr = lotto.toArray(new Integer[0]);
	}
}
