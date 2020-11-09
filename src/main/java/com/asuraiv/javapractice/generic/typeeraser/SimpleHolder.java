package com.asuraiv.javapractice.generic.typeeraser;

/*
	소거자(eraser)에 관한 예제 (역컴파일용)
 */
public class SimpleHolder {

	private Object obj;

	public void set(Object obj) {
		this.obj = obj;
	}

	public Object get() {
		return this.obj;
	}

	public static void main(String[] args) {

		SimpleHolder holder = new SimpleHolder();

		holder.set("Hello");

		String s = (String) holder.get();
	}
}
