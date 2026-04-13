package ex01_map.exam;

import java.util.HashMap;
import java.util.Map;

public class StudentAvg {
	public static void main(String[] args) {
		// 이름을 key, 점수를 value로 저장한다
		// 평균, 최고점 학생을 찾는다
		
		int total = 0;
		String topStudent = "";
		int maxScore = 0;
		
		// 평균 : xx점
//		// 최고점 학생 : xxx/00점
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 80);
		map.put("박길동", 70);
		map.put("이길동", 75);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String name = entry.getKey();
			int score = entry.getValue();
			
			total += score;
			
			if(score > maxScore) {
				maxScore = score;
				topStudent = name;
			}
		}
		
		double avg = total / map.size();
		
		System.out.println("평균 : " + avg + "점");
		System.out.println("최고점 학생 : " + topStudent + " / " + maxScore + "점");
		
		
		
		
	}
}
