package ex02_charstream;

public class Main {
	public static void main(String[] args) {
		FileConverter converter = new FileConverter();

		try {
			converter.copy("wall.jgp", "img/wal_copy.jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
