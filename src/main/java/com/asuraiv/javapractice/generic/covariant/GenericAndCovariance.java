package com.asuraiv.javapractice.generic.covariant;

import java.util.Arrays;
import java.util.List;

public class GenericAndCovariance {

	public static void main(String[] args) {

		// 본래 제네릭은 공변을 허용하지 않는다.
//		List<Fruit> fruits = new ArrayList<Apple>(); // compile error!

		// 와일드카드를 쓰면 공변을 허용한다
		final List<Apple> apples = Arrays.asList(new Apple(), new Apple());
		List<? extends Fruit> fruits = apples;

		// 아래처럼 요소를 추가하면, 컴파일에러가 발생한다.
		// 사실, 그 어떤 타입의 인스턴스도 추가할 수 없다.
//		fruits.add(new Apple()); // compile error
//		fruits.add(new Fruit()); // compile error
//		fruits.add(new Object()); // compile error

		Apple a = (Apple) fruits.get(0);

		System.out.println(fruits.contains(a));
		System.out.println(fruits.indexOf(a));
	}
}
