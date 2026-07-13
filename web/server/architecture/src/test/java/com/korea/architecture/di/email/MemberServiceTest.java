package com.korea.architecture.di.email;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTest {
	private MemberService memberService;
	
	@Autowired
	public MemberServiceTest(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@Test
	void memberJoinTest() {
		memberService.joinMember("김민수");
	}
}
