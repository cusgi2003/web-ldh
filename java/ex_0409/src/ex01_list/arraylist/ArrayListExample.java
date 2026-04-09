package ex01_list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList
		// List 인터페이스를 구현한 대표적인 클래스
		// 내부구조 : 배열을 기반으로 동작
		// 장점 : 조회속도가 빠르다(index로 접근하기 때문에)
		// 단점 : 중간 삽입/삭제 느리다(데이터의 이동이 발생한다.)
		
		// 언제쓰면 좋을까?
		// 삽입/삭제는 많지 않은데 조회가 많을 때
		
		// java.util패키지에 들어있다
		
		// 구현클래스의 객체는 해당 인터페이스의 타입변수에 담을 수 있다
		List<String> list = new ArrayList<String>();
		
		// 리스트에 데이터 추가하기
		list.add("A");
		list.add("B");
		
		if(list.add("C")) {
			System.out.println("데이터가 정상적으로 추가되었습니다");
		} else {
			System.out.println("데이터가 추가되지 않았습니다");
		}
		
		// 내가 원하는 위치에 데이터 넣기
		list.add(1, "데이터");
		
		// 데이터 값 바꾸기
		list.set(1, "D");
		
		// 리스트의 출력
		System.out.println(list);
		
		// 리스트에 들어있는 데이터를 하나만 꺼내기
		String s = list.get(0);
		System.out.println(s);
		
		// 연속되지 않는 인덱스에 값을 넣으려고 하면
		// ArrayIndexOutOfBoundException 발생
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
