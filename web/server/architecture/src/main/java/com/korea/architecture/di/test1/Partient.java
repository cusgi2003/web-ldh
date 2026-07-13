package com.korea.architecture.di.test1;

import org.springframework.stereotype.Component;

@Component
public class Partient {
	private String name = "홍길동";
	
	public void checkInformation(){
		System.out.println("환자" + name + "의 정보를 확인합니다");
	}

}
