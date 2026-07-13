package com.korea.architecture.di.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberService {

	private final NotificationService notificationService;
	
	@Autowired
	public MemberService(@Qualifier("smsNotificationService") NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void joinMember(String memberName) {
		System.out.println(memberName + "회원을 등록합니다");
		notificationService.send(memberName);
		System.out.println("회원 등록이 완료되었습니다.");
	}
}
