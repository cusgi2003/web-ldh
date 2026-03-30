package ex06_inheritance;

// 상속을 받는 쪽이 상속을 하는 쪽을 선택한다
// extends 키워드를 통해상속받을 클래스를 선택한다
public class SmartPhone extends Phone{
	public boolean wifi;
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다");
	}
	
	public void internet() {
		System.out.println("언터넷에 연결합니다.");
	}
}
