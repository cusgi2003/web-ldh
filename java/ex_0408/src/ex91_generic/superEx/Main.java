package ex91_generic.superEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	// List<? super Dog> List에서 허용하는 타입
	// List<dog>, List<animaml][List<objedd>
	// List<Puppy> 는 안됨
	public static void addDog(List <? super Dog> list) {
		list.add(new Dog());
		list.add(new Puppy()); // Puppy 객체는 Dog로 취급
	}
	
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		List<Puppy> puppyList = new ArrayList<Puppy>();
		
		addDog(animalList);
		addDog(dogList);
		
		// 불가능 (puppy는 Dog의 자식클래스이기 때먼에
//		addDog(puppyList);
		
		// 각 리스트에 들어있는 객체의 메서드 호출하기
		for(Object o : animalList) {
			((Animal)o).speak();
		}
	}
	
}
