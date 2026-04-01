package ex02_interface;

public class Television implements RemoteControl{
	
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켠다");
	}
	
	// 볼륨을 조정하는 setVolume 메서드 오버라이딩 하기
	// 넘어온 볼륨값이 max보다 크면 필드를 max로 세팅
	// 넘어온 볼륨값이 min보다 작으면 필드를 min로 세팅
	// 그게 아니면 넘어온 볼륨값으면 필드를 세팅
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}
	
}
