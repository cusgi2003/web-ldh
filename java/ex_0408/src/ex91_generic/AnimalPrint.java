package ex91_generic;

import java.util.List;

public class AnimalPrint {
	public void printAnimals(List<? extends Animal> animals){
		for(Animal a : animals) {
			System.out.println(a);
		}
	}
}
