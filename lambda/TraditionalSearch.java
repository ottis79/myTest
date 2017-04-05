package it.my.lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish",false,true));
		animals.add(new Animal("turtle",false,true));
		animals.add(new Animal("kangaroo",true,false));
		animals.add(new Animal("rabbit",true,false));
		
		printStatus(animals, a-> a.canHop());

	}
	
	private static void printStatus(List<Animal> animals, CheckTrait check){
		for(Animal animal: animals){
			if(check.test(animal))
				System.out.println(animal+" ");
		}
		System.out.println();
	}
}
