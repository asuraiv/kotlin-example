package com.asuraiv.javapractice.variant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Animal {}
class Mammal extends Animal {}
class Cat extends Mammal {}

public class VariantTest {

	public static void main(String[] args) {

		MyStack<Mammal> cage = new MyStack<>();

		Collection<Cat> cats = Arrays.asList(new Cat(), new Cat());

		cage.pushAll(cats);

		System.out.println(cage);

		Collection<Animal> animalShelter = new ArrayList<>();

		cage.popAll(animalShelter);
	}
}
