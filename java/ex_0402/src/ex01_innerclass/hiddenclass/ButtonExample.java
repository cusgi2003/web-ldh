package ex01_innerclass.hiddenclass;

public class ButtonExample {
	public static void main(String[] args) {
		// 메서드에 매개변수로 전달하는 방식을 이용하여
		// 이벤트 처리하기
		Button btnOk = new Button();
		
		// setter
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("확인버튼을 누른다");
				
			}
		});
		
		btnOk.click();
		
		
		Button btnCancle = new Button();
		
		btnCancle.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("거부버튼을 누른다");
				
			}
		});
		
		btnCancle.click();
	}
}
