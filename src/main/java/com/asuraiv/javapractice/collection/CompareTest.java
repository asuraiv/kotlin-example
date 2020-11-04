package com.asuraiv.javapractice.collection;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(@NotNull Person other) {
		return Integer.compare(this.age, other.age);
	}

	@Override
	public String toString() {
		return "Person{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}
}

public class CompareTest {

	public static void main(String[] args) {

		final List<Person> people = Arrays.asList(new Person("park", 20), new Person("hong", 11), new Person("lee", 50));

		Collections.sort(people);

		System.out.println(people);
	}
}
