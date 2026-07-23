package com.korea.petclinic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry
		.addMapping("/**")//모든 리소스에 대해 CORS 설정을 적용
		.allowedOrigins("http://127.0.0.1:5500")
		.allowedMethods("GET","POST","PUT","DELETE")//http 요청 메서드 허용
		.allowedHeaders("*")//모든헤더를 허용
		.allowCredentials(true) //쿠키나 인증 정보를 포함한 요청 허용
		.maxAge(3600); //브라우저가 서버로부터 받은 응답을 일정 시간 동안 저장
	}
}
