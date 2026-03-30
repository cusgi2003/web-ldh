package ex04_setter_getter;

public class User {
	private String userName;
	private String password;
	private String email;
	
	public void setUserName(String userName) {
		if(!(userName.length() >= 4)) {
			System.out.println("아이디는 4글자 이상이여야 합니다.");
		}
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName = userName;
	}
	

	public void setPassword(String password) {
		if(!(password.length() > 6)) {
			System.out.println("비밀번호는 6글자 이상이여야 합니다");
		}
		this.password = password;
	}
	
	public String getPassword() {
		return this.password = password;
	}
	
	
	public void setEmail(String email) {
		if(!(email.contains("@"))) {
			System.out.println("이메일 형식 오류");
		}
		this.email = email;
	}
	
	public String getEmail() {
		return this.email = email;
	}
}
