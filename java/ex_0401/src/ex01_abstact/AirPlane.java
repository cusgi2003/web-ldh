package ex01_abstact;

public class AirPlane extends Transport{
	int airportFee;	// 공항 이용료
	int fuelcharge; // 유류할증비
	
	// 기본요금 + 공향 이용료 + 유류할증비
	public AirPlane(String name, int baseFare, int airportFee, int fuelcharge) {
		super(name, baseFare);
		this.airportFee = airportFee;
		this.fuelcharge = fuelcharge;
	}

	@Override
	public int calculatorFare() {
		return baseFare + airportFee + fuelcharge;
	}
}
