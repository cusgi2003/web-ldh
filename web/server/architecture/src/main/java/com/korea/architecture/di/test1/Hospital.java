package com.korea.architecture.di.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	private final Doctor doctor;
	
	@Autowired
	public Hospital(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public void startMedicalService() {
		System.out.println("병원 진료 업무를 시작합니다.");
		doctor.treat();
		System.out.println("병원 진료 업무를 종료합니다.");
	}
	
}
