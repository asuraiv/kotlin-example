package com.asuraiv.javapractice.generic.covariant;

class Animal {}
class Mammal extends Animal {}
class Cat extends Mammal {}

public class Cage<T> {

	private T value;

	public Cage() {
	}

	public Cage(T value) {
		this.value = value;
	}

	public void set(T val) {
		this.value = val;
	}

	public T get() {
		return value;
	}

	public boolean equals(Object obj) {
		return value.equals(obj);
	}

	public static void main(String[] args) {

		Cage<Cat> catCage = new Cage<>(new Cat());

		Cage<? extends Mammal> mammalCage = catCage;

		final Mammal mammal = mammalCage.get();
		final Cat cat = (Cat) mammalCage.get();

		// 컴파일에러. extends 한정적 와일드카드 타입을 사용한 제네릭은 '소비'(외부 객체를 저장) 할 수 없다!
		// 'mammalCage 의 파라메터화 타입은 '? extends Mammal' 이고, 이것은 Mammal 을 상속한 그 어떤것도 될 수 있으며,
		// 컴파일러가 타입 안전한지를 검사하는 것이 불가능하다는 의미이다.
		// 컴파일러는 인자로 전달 되거나 반환되는 객체의 타입에만 신경을 쓴다. 그 외의 이유로 코드를 검사하지 않는다!
//		mammalCage.set(new Cat()); // compile error!

		// 반공변 예제
		Cage<? super Cat> mammalCage2 = new Cage<Mammal>();

		mammalCage2.set(new Cat()); // 이제 소비 가능하다.
	}
}
