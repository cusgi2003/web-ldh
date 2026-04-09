package ex01_list.arraylist.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayLength {
	public static void main(String[] args) {
		// 문자열 타입 리스트 객체를 만든다
		List<String> list = new ArrayList<String>();
		
		// 리스트에 "Java", "Spring", "HTML", "CSS"를 저장하기
		list.add("Java");
		list.add("Spring");
		list.add("HTML");
		list.add("CSS");
		
		// 각 문자열의 길이를 계산하여 lengths라는 새로운 리스트를
		// 만들어서 저장하기
		List<Integer> lengths = new ArrayList<Integer>();
		for(String s : list) {
			lengths.add(s.length());
		}
		System.out.println("문자열의 길이 : " + lengths);
		
		// 문자열 형태의 리스트 생성하기
		// "김철수", "이영희", "김철수", "박민수", "김철수" 저장하기
		// 리스트에 "김철수"가 몇번 들어있는지 계산하여 출력하기
		
		List<String> strList = new ArrayList<String>();
		strList.add("김철수");
		strList.add("이영희");
		strList.add("김철수");
		strList.add("박민수");
		strList.add("김철수");
		
		int count = 0;
		for(String s : strList) {
			if(s.equals("김철수")) {
				count++;
			}
		}
		System.out.println("김철수 포함 횟수 : " + count);
		
		
		// scores 정수타입 리스트
		// 88,72,95,60,81
		// 최고점수와 최소점수를 찾아서 차이 출력
		
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(88);
		scores.add(72);
		scores.add(95);
		scores.add(60);
		scores.add(81);
		
		int maxScore = scores.get(0);
		int minScore = scores.get(0);
		for(Integer num : scores) {
			if(num > maxScore) {
				maxScore = num;
			} else if(num < minScore) {
				minScore = num;
			}
		}
		System.out.println("점수 차이 : " +(maxScore - minScore));
	}
}
