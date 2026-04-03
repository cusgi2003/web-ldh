package ex02_object;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("name1", "info1");
		Member obj2 = new Member("name2", "info2");
		Member obj3 = new Member("name3", "info3");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다");
		} else {
			System.out.println("동등하지 않습니다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동일합니다");
		} else {
			System.out.println("동등하지 않습니다");
		}
	}
}
