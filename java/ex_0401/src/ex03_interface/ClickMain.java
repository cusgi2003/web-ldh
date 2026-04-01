package ex03_interface;

import java.util.Iterator;

public class ClickMain {
	public static void main(String[] args) {
		Button button = new Button();
		
		button.setClickListener(new LoginListener());
        button.click();
		
        button.setClickListener(new LogoutListener());
        button.click();
		
		System.out.println("-----------------------------");
		
		ClickListener[] cll = {
				new LoginListener(),
				new LogoutListener()
		};
		
		for (ClickListener c: cll) {
			c.onClick();
		}
	}
}
