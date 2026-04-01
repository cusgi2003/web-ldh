package ex011_abstract;

public abstract class Taxi extends Transport{

	int farePerKm;
	
	public Taxi(String name, int distance, int baseFare, int farePerKm) {
		super(name);	
		
	}
	
}
