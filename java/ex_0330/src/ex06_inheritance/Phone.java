package ex06_inheritance;

// 상속해주는 클래스
// 자식 클래스에게 필드, 메서드를 사용할 수 있도록 제공
public class Phone {
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendMessage(String message) {
		System.out.println("나 : " +message);
	}
	
	public void receiveMessage(String message) {
		System.out.println("상대방 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
}
