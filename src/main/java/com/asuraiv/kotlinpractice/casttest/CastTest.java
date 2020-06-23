package com.asuraiv.kotlinpractice.casttest;

import java.math.BigInteger;

class Something {}
class Another {}

public class CastTest {


	public static void main(String[] args) {

		BigInteger bi1 = new BigInteger("1");
		BigInteger bi2 = new BigInteger("2");

		System.out.println(bi1.add(bi2));

		Another another = castFrom(new Something());
		System.out.println(another);
	}

	private static Another castFrom(Something s) {
		try {
			return Another.class.cast(s);
		} catch (Exception e) {
			return null;
		}
	}
}
