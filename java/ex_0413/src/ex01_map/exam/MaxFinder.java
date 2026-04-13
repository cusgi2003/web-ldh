package ex01_map.exam;

import java.util.HashMap;
import java.util.Map;

public class MaxFinder {
	public static void main(String[] args) {
		int[] arr = {1,3,2,3,4,3,2,2,2};
		
		// 숫자별 등장 횟수를 HashMap<Integer, Integer>로 센다
		// 가장 큰 빈도수를 가진 숫자를 찾는다
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(Integer array : arr) {
			if(map.containsKey(array)) {
				map.put(array, map.get(array)+1);
			} else {
				map.put(array, 1);
			}
		}
		
		int maxNum = 0;
		int mostInt = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(maxNum <= entry.getValue()) {
				maxNum = entry.getValue();
				mostInt = entry.getKey();
			}
		}
		System.out.println("가장 많이 등장한 숫자 : " + mostInt);
		System.out.println("등장 횟수 : " + maxNum);
		
	}
}
