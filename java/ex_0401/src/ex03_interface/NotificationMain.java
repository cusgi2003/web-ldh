package ex03_interface;

public class NotificationMain {
	public static void main(String[] args) {
		Notification[] notify = {
				new SmsNotification(),
				new EmailNotification()
		};
		
		for(Notification n : notify) {
			n.send("안녕하세요");
		}
		
	}
}
