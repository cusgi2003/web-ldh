package ex02_charstream.exam;

public class User {
	String id;
	String password;
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	
	byte[] toByteData() {
		String result = id + ":" + password + "\n";
		return result.getBytes();
	}
}
