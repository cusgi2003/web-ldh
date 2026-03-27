package ex02_method;

public class MethodExample {
	// 메서드의 구조
	// 접근제한자 변환명 메서드명(매개변수){
	//	실행하고자 하는 명령
	//	return 반환값;
	//}
		
	// 반환할 값이 없으면 반환값은 void
	// 외부에서 받을 값이 없으면 매개변수는 생략 가능
		
	// "메서드가 호출되었습니다" 라고 출력되는 printInfo 메서드 작성하기
	public void printInfo() {
		System.out.println("메서드가 호출되었습니다");
	}
	
	// 두 수를 더하여 반환하는 add 메서드 작성하기
	
	 public int add(int a,int b) {
		return a+b;
	}
	 
	 // 원의 넓이를 구하는 circleArea 메서드 작성하기
	 // 원의 넓이 : 3.14 * 반지름 * 반지름
	 
	 
	 // 메서드를 정의 -> 외부에서 받아야 할 값이 있으면 매개변수 설정 -> 코드블럭에 기능을 정의
	 // -> 연산 결과를 보내줘야 하면 return 을 정의
	 public double circleArea(double meter) {
		 return (double)(3.14 * meter * meter);
	 }
	 
	 // 원의 둘레를 구하는 circleROund메서드 정의하기
	 // 반지름은 외부에서 전달받는다.
	 // 원의 둘레 : 2 * 3.14 * 반지름
	 // 메서드 내부에서 둘레를 구하고 출력한 뒤 종료
	 
	 public void circleRound(double meter) {
		 System.out.println(2 * 3.14 * meter);
	 }
	 
	 // 정수 배열을 매개변수로 받아서 짝수의 개수를 반환하는 countEven 메서드 작성하기
	 public int countEven(int[] arr) {
		 int count = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int i1:arr) {
				 if( i1 % 2 == 0) {
					 count++;
				 }
			 }
		 }
		 
		 return count;
	 }
	 
	 
	 // 특정 문자 개수 세기
	 // 문자열과 문자 하나를 매개변수로 받아서
	 // 문자열에 해당 문자가 몇번 등장하는지 반환하는 countChar 메서드 작성하기
	 
	 // str -> abc
	 // t -> a
	 // a-> 1
	 
	 public int countChar(String str, char ch) {
		 int count = 0;
		 for(String s : str.split("")) {
			 if(s.charAt(0) == ch) {
				 count++;
			 }
		 }
		 return count++;
	 }

	 
	 
	 
	 
	 
	 
	 
	 
	 
}
