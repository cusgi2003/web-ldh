package ex02_interface;

// 서로 다른 인터페이스에 정으된 추상메섣르르 전부 구현해야 한다.

public class SmartTelevision implements RemoteControl, SearchAble{
	@Override
	public void turnOn() {
		System.out.println("스마트 티비를 합니다");
		
	}
	
	@Override
	public void setVolume(int volume) {	
	}
	@Override
	public void search(String url) {
		System.out.println("url을 검색합니다");
		
	}
}
