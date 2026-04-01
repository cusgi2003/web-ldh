package ex03_interface;

public class SmsNotification implements Notification{
	@Override
	public void send(String message) {
		System.out.println("[SMS]인증번호를 전송합니다");
		
	}
}
