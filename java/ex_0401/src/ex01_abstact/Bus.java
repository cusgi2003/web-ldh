package ex01_abstact;

public class Bus extends Transport{
	
	// 상속을 받으면 자식객체가 만들어질 때 부모생성자가 먼저 호출이 된다
	// 부모 생성자에 매개변수가 들어있으면 명시해줘야 한다
	
	public Bus(String name, int baseFare) {
		super(name, baseFare);
	}

	@Override
	public int calculatorFare() {
		return this.baseFare;
	}
}
