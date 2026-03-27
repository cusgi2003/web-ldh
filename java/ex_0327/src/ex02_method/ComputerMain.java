package ex02_method;

public class ComputerMain {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		// 1,2,3,4,5
		int inSum = computer.sum(1,2,3,4,5);
		System.out.println(inSum);
		
	}
}
