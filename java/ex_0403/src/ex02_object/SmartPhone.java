package ex02_object;

public class SmartPhone {
	private String compony;
	private String os;
	
	public SmartPhone(String compony, String os) {
		this.compony = compony;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return compony + ", " + os;
	}
}
