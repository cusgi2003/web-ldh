package com.korea.architecture.di.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

	private final Partient partient;
	
	@Autowired
	public Doctor(Partient partient) {
		this.partient = partient;
	}
	
	public void treat() {
		System.out.println("의사가 환자 진료를 시작합니다.");
		partient.checkInformation();
		System.out.println("환자 진료가 완료되었습니다");
	}
}
