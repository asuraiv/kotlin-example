package com.asuraiv.javapractice.variant;

import java.util.Collection;
import java.util.Stack;

public class MyStack<T> extends Stack<T> {

	public void pushAll(Collection<? extends T> src) {
		for (T elem : src) {
			push(elem);
		}
	}

	public void popAll(Collection<? super T> dst) {
		while(!isEmpty()) {
			dst.add(pop());
		}
	}
}
