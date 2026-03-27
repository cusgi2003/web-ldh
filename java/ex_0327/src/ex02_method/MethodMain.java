package ex02_method;

public class MethodMain {
	public static void main(String[] args) {
		MethodExample method = new MethodExample();
		method.printInfo();
		
		System.out.println(method.add(1, 5));
		
		// =======================================
		
		double areaCircle = method.circleArea(5);
		System.out.println(areaCircle);
		
		method.circleRound(5);	// return 값이 없을 때
		
		// =======================================
		
		int even = method.countEven(new int[]{1,2,3,4,5,6,7,8,9}); 
		System.out.println(even);
		
		int result = method.countChar("apple", 'p');	// return 값이 있을 때
		System.out.println(result);
	}
}
