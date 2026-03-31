package ex05_polymorphism.exam01;

class CarGas{
	int gasGauge;
	
	public CarGas(int gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가스량 : " + gasGauge);
	}
}

class HybridCar extends CarGas{
	
	int electricGauge;
	
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge(){
		super.showCurrentGauge();
		System.out.println("잔여 가스량 : " + electricGauge);
	}
}

class HybridWaterCar extends HybridCar{
	
	int waterGauge;
	
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge(){
		super.showCurrentGauge();
		System.out.println("잔여 물량 : " + waterGauge);
	}
}


public class CarResultMain {
	public static void main(String[] args) {
		HybridWaterCar hybridWater = new HybridWaterCar(15,30,25);
		
		hybridWater.showCurrentGauge();
	}
}
