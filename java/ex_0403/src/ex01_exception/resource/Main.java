package ex01_exception.resource;

public class Main {
	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("에외 처리 : " + e.getMessage());
		}
	}
}
