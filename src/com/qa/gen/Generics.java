package com.qa.gen;

public class Generics {

	public static void main(String[] args) {
		Cage<Dog> kennel = new Cage<>();
		kennel.setAnimal(new Dog());
		kennel.getAnimal().fetch();
// 		Animal a = kennel.getAnimal();
//		if (a instanceof Dog) {
//			((Dog) a).fetch();
//		}
//		kennel.setAnimal(new Lion());

		Cage<Lion> lionCage = new Cage<>();
		lionCage.setAnimal(new Lion());
//		lionCage.setAnimal(new Dog());
//		Cage<String> stringCage = new Cage<>();
	}

}
