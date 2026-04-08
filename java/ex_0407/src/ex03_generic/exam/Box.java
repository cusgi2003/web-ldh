package ex03_generic.exam;

public class Box <T,U> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
	// 제네릭 메서드
	// 메서드에만 적용되는 제네릭 타입을 따로 두는 것
	// 제네릭클래스가 아니어도 제네릭 메서드를 만들 수 있다
}
