package ex91_generic.exam;

// 제네릭 타입 T를 사용하는 클래스
// item 필드 1개를 가진다. 타입은 T
// setter로 갑을 지정한다
// getter로 메서드 값을 반환한다
// main에서 genericBox<String> 객체에 "사과" 저장 후 출력
// GenericBox<Integer> 객체에 100 저장 후 출력

public class GenericBox <T>{
	private T item;
	
	public void setItem(T item){
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
	
}
