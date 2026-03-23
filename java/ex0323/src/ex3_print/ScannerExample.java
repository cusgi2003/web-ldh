package ex3_print;

// java.util 패키지에 있는 Scanner 클래스
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// 클래스에 정의되어있는 기능을 사용하려면
		// 클래스를 객체로 만드는 작업을 해야된다.
		// 객체의 생성 : new 클래스명();
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		
		String name, address;
		int age;
		double height;
		
		// 객체를 틍해 클래스 안에 정의된 기능을 호출
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.println();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.println();
		
		System.out.print("주소 : ");
		address = sc.next();
		System.out.println();
		
		System.out.print("신장 : ");
		height = sc.nextDouble();
		System.out.println();
		
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 나이는 %d세 입니다.\n", age);
		System.out.printf("당신의 주소는 %s입니다.\n", address);
		System.out.printf("당신의 신장은 %.1fcm입니다.", height);
	}
}
