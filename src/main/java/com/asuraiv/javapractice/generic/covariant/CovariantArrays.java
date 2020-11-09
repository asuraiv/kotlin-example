package com.asuraiv.javapractice.generic.covariant;

class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class CovariantArrays {

	public static void main(String[] args) {

		Fruit[] fruits = new Apple[10];

		// 배열은 공변하므로, 아래가 성립
		fruits[0] = new Apple();
		fruits[1] = new Jonathan();

		try {
			// 부모클래스인 Fruit 인스터스 추가를 컴파일 시간에 허용하지만
			// 런타임에 예외가 발생한다. 실제 할당된 배열의 타입은 'Apple' 이기 때문.
			fruits[2] = new Fruit(); // java.lang.ArrayStoreException
		} catch (Exception e) {
			System.err.println(e);
		}

		/*
			배열은 실제 배열 요소에 어떤 타입의 인스턴스가 할당되었는지 컴파일 시간에 정확히 알지 못한다.
			따라서 타입 안전한 코드를 작성하기 어렵다.
		 */
	}
}
