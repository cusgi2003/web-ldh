package ex03_generic;

// 제네릭타입은 두 개 이상도 작성할 수 있다.
class PairBox<T, U>{
	private T first;
	private U second;
	
	public void set(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	// getter
	public T getFirst() {
		return first;
	}
	public U getSecond() {
		return second;
	}

}

public class multiTypeExample {
	public static void main(String[] args) {
		PairBox<String, Integer> box1 = new PairBox();
		box1.set("홍길동", 20);
		System.out.println(box1.getFirst());
		System.out.println(box1.getSecond());
		
		PairBox<String, Double> box2 = new PairBox();
		box2.set("점수", 92.55);
		System.out.println(box2.getFirst());
		System.out.println(box2.getSecond());
	}
}
