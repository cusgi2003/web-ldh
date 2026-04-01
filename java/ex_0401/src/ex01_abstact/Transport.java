package ex01_abstact;

public abstract class Transport {
	String name;
	int baseFare;
	
	public Transport(String name, int baseFare) {
		this.name = name;
		this.baseFare = baseFare;
	}
	
	public void showName() {
		System.out.println("교통 수단 : " + this.name);
	}

	public abstract int calculatorFare();
	
	public void printFare() {
		showName();
		System.out.println("이동 거리 : " + this.baseFare);
		System.out.println("총 요금 : " + calculatorFare() + "원");
	}
	

}
