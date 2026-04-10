package ex03_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		// 1 ~ 50사이의 난수가 있다
		// 5 x 5 의 빙고판에 25개의 숫자를 채운다
		// 겹치면 안됨
		
		// 만약 숫자가 오름차순으로 들어간다면 섞어주기
		
		// ex)
		
		// 5	7	23	9	13
		// 41	38	17	10	3
		// 26	...
		
		Set<Integer> bingo = new HashSet<Integer>();
		while(bingo.size() != 25) {
			bingo.add((int)((Math.random()*50)+1));
		}
		List<Integer> list = new ArrayList<>(bingo	);
		Collections.shuffle(list);
		
		for(int i = 0; i < 25; i++) {
			System.out.print(list.get(i) + " ");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		
	}
}
