package cohension;

// 1. 기능적 응집도
// 하나의 작업만 깔끔하게 수행하는 모듈
public class Calculator {
	//오질 두 수의 더하기라는 단 하나의 목적만 수행한다
	public int  add(int x, int y) {
		return x+y;
	}
}