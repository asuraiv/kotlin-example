package com.asuraiv.kotlinjavapractice.nulltest;

import static com.asuraiv.kotlinpactice.nulltest.NullTestUtilsKt.yellAt;

public class NullTest {

	public static void main(String[] args) {

		yellAt(new Person(null));
	}
}
