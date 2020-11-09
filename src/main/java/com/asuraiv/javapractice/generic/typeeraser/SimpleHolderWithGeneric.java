package com.asuraiv.javapractice.generic.typeeraser;

/*
	소거자(eraser)에 관한 예제 (역컴파일용) - Generic 사용
 */
public class SimpleHolderWithGeneric<T> {

	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return this.obj;
	}

	public static void main(String[] args) {

		SimpleHolderWithGeneric<String> holder = new SimpleHolderWithGeneric<>();

		holder.set("Hello");

		String s = holder.get();
	}
}
