package com.asuraiv.javapractice.generic.typeeraser;

/*
	소거자(eraser)에 관한 예제 (역컴파일용)
 */
public class SimpleArrayHolderWithGeneric<T> {

	private T[] obj;

	@SuppressWarnings("unchecked")
	public SimpleArrayHolderWithGeneric(int size) {
		this.obj = (T[])new Object[size];
	}

	public void set(int index, T val) {
		obj[index] = val;
	}

	public T get(int index) {
		return this.obj[index];
	}

	public static void main(String[] args) {

		SimpleArrayHolderWithGeneric<Integer> arrayHolder = new SimpleArrayHolderWithGeneric<>(3);
		arrayHolder.set(0, 1);

		int val = arrayHolder.get(0);
	}
}
