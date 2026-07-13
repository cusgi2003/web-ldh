package com.korea.architecture.di.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationService {
	private final CustomerService customerService;
	private final TravelProductService travelProductService;
	
	@Autowired
	public ReservationService(CustomerService customerService, TravelProductService travelProductService) {
		this.customerService = customerService;
		this.travelProductService = travelProductService;
	}
	
	public void reserve() {
		customerService.checkCustomer();
		travelProductService.checkTravelProduct();
		System.out.println("여행 예약을 시작합니다.");
	}
}
