package ex03_interface;

class LoginListener implements ClickListener{
	@Override
	public void onClick() {
		System.out.println("로그인 처리 실행");
		
	}
}

class LogoutListener implements ClickListener{
	@Override
	public void onClick() {
		System.out.println("로그아웃 처리 실행");
		
	}
}

public class Button{
	
	ClickListener clickListener;
		
	void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	void click() {
		clickListener.onClick();
	}
}
