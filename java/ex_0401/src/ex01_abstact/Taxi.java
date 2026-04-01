package ex01_abstact;

public class Taxi extends Transport{
	int distance;
	int farePerKm;
	
	public Taxi(String name, int baseFare, int distance, int farePerKm) {
		super(name, baseFare);
		this.distance = distance;
		this.farePerKm = farePerKm;
	}

	@Override
	public int calculatorFare() {	
		return baseFare + (distance * farePerKm);
	}
	
}
