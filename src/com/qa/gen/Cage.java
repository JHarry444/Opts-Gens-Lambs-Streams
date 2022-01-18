package com.qa.gen;

public class Cage<T extends Animal> {

	private T animal;

	public T getAnimal() {
		return this.animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}

}
