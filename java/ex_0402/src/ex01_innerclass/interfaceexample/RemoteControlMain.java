package ex01_innerclass.interfaceexample;

public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		RemoteControl.Button btn = rc.new Button();
		
		btn.press();
		System.out.println("현재 전원 상태 : " + rc.power);
	}
}
