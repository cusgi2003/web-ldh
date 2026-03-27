package ex04_construcor;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 기본 생성자
	// 반환타입이 없다
	// 생성자의 이름은 반드시 클래스명이어야 한다
	public Car() {
		
	}
	
	// this()
	// 현재 클래스에 선언되어 있는 생성자를 가리킬 수 있는 키워드
	
	public Car(String model) {
		this.model = model;
	}
	
	// 모델만 초기화 하는 생성자
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 모델, 색상, 최고속도를 초기화 하는 생성자
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
